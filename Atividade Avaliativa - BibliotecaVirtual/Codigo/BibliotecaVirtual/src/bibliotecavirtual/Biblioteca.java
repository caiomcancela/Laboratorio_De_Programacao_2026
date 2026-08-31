package bibliotecavirtual;

import bibliotecavirtual.Interfaces.Emprestar; // importando a interface da pasta Interfaces
import java.util.ArrayList;

public class Biblioteca implements Emprestar {
    private ArrayList<Livro> livros = new ArrayList<>();
    
    public void adicionarLivro(Livro livro){
       livros.add(livro);
    }
    
    public void listarLivro(){
        for(Livro livro: livros){
            System.out.println("Titulo: " + livro.getTitulo() + 
                    " Autor: " + livro.getAutor() + "Disponibilidade:  " + livro.estaDisponivel());
        }
    }
    
    public Livro buscarLivro(String titulo){
        for(Livro livro: livros){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }
    
    @Override
    public void emprestar(Livro livro){
        Livro livroEmprestar = buscarLivro(livro.getTitulo());
        if(livroEmprestar.isDisponibilidade()){
            livroEmprestar.setDisponibilidade(false);
            System.out.println("Livro emprestado com sucesso!");
        }else{
            System.out.println("Livro já esta emprestado!");
        }
    }
    
    @Override
    public void devolver(Livro livro){
        Livro livroEmprestar = buscarLivro(livro.getTitulo());
        livroEmprestar.setDisponibilidade(true);
        System.out.println("Livro devolvido com sucesso!");
    }
}
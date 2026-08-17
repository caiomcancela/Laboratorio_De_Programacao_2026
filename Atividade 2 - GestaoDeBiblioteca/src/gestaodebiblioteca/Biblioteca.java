package gestaodebiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    
    public void adicionarLivro(Livro livro){
       livros.add(livro);
    }
    
    public void listarLivro(){
        for(Livro livro: livros){
            System.out.println("Titulo: " + livro.getTitulo() + " Autor: " + livro.getAutor());
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
}

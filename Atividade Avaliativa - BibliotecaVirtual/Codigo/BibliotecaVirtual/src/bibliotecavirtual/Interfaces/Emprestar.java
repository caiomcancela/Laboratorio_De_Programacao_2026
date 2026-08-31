package bibliotecavirtual.Interfaces;
import bibliotecavirtual.Livro; // Importando a classe livro

public interface Emprestar {
    public void emprestar(Livro livro);
    
    public void devolver(Livro livro);
    
    
}

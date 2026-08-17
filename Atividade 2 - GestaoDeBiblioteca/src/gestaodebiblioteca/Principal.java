package gestaodebiblioteca;

public class Principal {
    public static void main(String[] args) {
        LivroFisico livroFisico = new LivroFisico("Codigo Limpo", " Robert C. Martin", 432, 500);
        Ebook livroEbook = new Ebook("Arquitetura Limpa"," Robert C. Martin", 432, 500);
        
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(livroEbook);
        

        biblioteca.listarLivro();
        
    }
}

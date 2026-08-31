package bibliotecavirtual;

public abstract class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDisponibilidade() {
        return disponivel;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponivel = disponibilidade;
    }
    
    public String estaDisponivel(){
        if(disponivel){
            return "Disponivel";
        }else{
            return "Indisponivel";
        }
    }

    public abstract void descricao();
}
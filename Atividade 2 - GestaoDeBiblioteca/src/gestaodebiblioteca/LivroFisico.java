package gestaodebiblioteca;

public class LivroFisico extends Livro {
    private double peso;
    
    public LivroFisico (String titulo, String autor, int numeroPaginas, double peso){
        super(titulo,autor,numeroPaginas);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public void descricao(){
        System.out.println("Título: " + super.getTitulo()
        + "\nAutor: " + super.getAutor()
        + "\nQuantidade de páginas: " + super.getNumeroPaginas()
        + "\nPeso: " + getPeso() + "g" + "Tipo: Fisico");
    }
    
}

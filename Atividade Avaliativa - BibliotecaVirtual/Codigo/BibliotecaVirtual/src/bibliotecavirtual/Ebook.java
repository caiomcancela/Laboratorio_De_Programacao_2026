package bibliotecavirtual;

public class Ebook extends Livro{
    private double tamanhoArquivo;
    
    public Ebook (String titulo, String autor, int numeroPaginas, double tamanhoArquivo){
        super(titulo,autor,numeroPaginas);
        this.tamanhoArquivo = tamanhoArquivo;
        
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
    @Override
    public void descricao(){
        System.out.println("Título: " + super.getTitulo()
        + "\nAutor: " + super.getAutor()
        + "\nQuantidade de páginas: " + super.getNumeroPaginas()
        + "\nTamanho Arquivos: " + getTamanhoArquivo() + " MB" + "\n Tipo: Ebook");
    }
}
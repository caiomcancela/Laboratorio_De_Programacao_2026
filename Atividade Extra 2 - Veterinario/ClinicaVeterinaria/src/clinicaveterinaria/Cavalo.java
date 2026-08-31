package clinicaveterinaria;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }
    
    @Override
    public void emitirSom(){
        System.out.println(super.getNome() + " esta relinchando: iiirrrrri");
    }
}
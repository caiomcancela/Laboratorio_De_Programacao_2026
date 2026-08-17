package ligadosherois;

public class Goku extends Heroi{
    
    public Goku(String nome, int vida, int energia){
        super(nome,vida,energia);
    }
    

    @Override
    public void atacar(){
        System.out.println("Estou Atacando com Kamehameha");
    } 
}

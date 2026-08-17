package ligadosherois;

public class Sonic extends Heroi {
    public Sonic(String nome, int vida, int energia){
        super(nome,vida,energia);
    }
    
    @Override
    public void atacar(){
        System.out.println("Estou Atacando com Spin Dash");
        
    } 
}

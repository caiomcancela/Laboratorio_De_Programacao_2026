package ligadosherois;

public class Principal {
    public static void main(String[] args) {
        Goku goku = new Goku("Son Goku",8000,100);
        Sonic sonic = new Sonic("Sonic",100,100);
        Mario mario = new Mario("Mario", 50, 100);
        
        goku.apresentar();
        goku.atacar();
        
        sonic.apresentar();
        sonic.atacar();
        
        mario.apresentar();
        mario.atacar();
    }
}

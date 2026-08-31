package clinicaveterinaria;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex",5,"Marrom");

        Gato gato = new Gato("Mingau",3,"Branco");

        Cavalo cavalo = new Cavalo("Pé de Pano",7,"Preto");
        
        cachorro.emitirSom();
        gato.emitirSom();
        cavalo.emitirSom();

        Veterinario veterinario = new Veterinario("Dr. Carlos","12345V");

        veterinario.adicionarAnimal(cachorro);
        veterinario.adicionarAnimal(gato);
        veterinario.adicionarAnimal(cavalo);

        veterinario.examinarAnimais();
        
        veterinario.removerAnimal("Rex");
        
        veterinario.listarCarrocinha();
    }
}

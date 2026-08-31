package clinicaveterinaria;

import java.util.ArrayList;

public class Veterinario {
    public String nome;
    public String CRMV; // docuemento necessario para atuar como veterinario;
    
    public ArrayList<Animal> animais = new ArrayList<>();
    public ArrayList<Animal> carrocinha = new ArrayList<>();

    public Veterinario(String nome, String CRMV) {
        this.nome = nome;
        this.CRMV = CRMV;
    }
    
    public void adicionarAnimal(Animal animal){
       animais.add(animal);
    }
    
    public void removerAnimal(String nomedoAnimal){
        Animal animalBuscado  = pesquisarAnimal(nomedoAnimal);
        if(animalBuscado != null){
            animais.remove(animalBuscado);
            System.out.println(animalBuscado.getNome() + " devolvido com sucesso");
        }else{
            System.out.println(animalBuscado.getNome() + " não esta presente");
        }
    }
    
    private Animal pesquisarAnimal(String nome){
        for(Animal animal: animais){
            if(animal.getNome().equals(nome)){
                return animal;
            }
        }
        return null;
    }
    
    public void examinarAnimais(){
        for(Animal animal: animais){
            System.out.println("Veterinario examinando" + animal.getNome());
        }
    }
    
    public void adicionarNaCarrocinha(Animal animal){
        System.out.println(animal.getNome() + "Adicionado na carrocinha");
    }
    
    public void listarCarrocinha(){
        for(Animal animal: animais){
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Cor: " + animal.getCor());
        }
    }
    
    
}
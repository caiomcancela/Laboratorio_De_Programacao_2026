package bibliotecavirtual;

import bibliotecavirtual.Interfaces.Exibir; // importando a interface da pasta Interfaces

public class Funcionario extends Pessoa implements Exibir{
    private Double salario;
    private String cargo;

    public Funcionario(Double salario, String cargo, String nome, String endereco,
            String cpf, int idade, String Telefone) {
        super(nome, endereco, cpf, idade, Telefone);
        this.salario = salario;
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void exibirInformações(){
        System.out.println(
                "Nome: " + super.getNome() +
                "\nCPF: " + super.getCpf() + 
                "\nEndereço" + super.getEndereco() +
                "\nTelefone" + super.getTelefone() +
                "\nCargo" + getCargo() 
        );
    }
    
    public void IniciarJornada(){
        System.out.println("Você iniciou a sua Jornada de trabalho!");
    }
    
    public void finalizarJornada(){
        System.out.println("Você finalizou a sua Jornada de trabalho!");
    }
    
    
}

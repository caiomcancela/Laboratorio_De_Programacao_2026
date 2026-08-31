package bibliotecavirtual;

import bibliotecavirtual.Interfaces.Exibir; // importando a interface da pasta Interfaces

public class Membro extends Pessoa implements Exibir {
    private String matricula;
    private String dataDeCadastro;

    public Membro(String matricula, String dataDeCadastro, String nome, 
            String endereco, String cpf, int idade, String Telefone) {
        super(nome, endereco, cpf, idade, Telefone);
        this.matricula = matricula;
        this.dataDeCadastro = dataDeCadastro;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataDeCadastro(String dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
    
    @Override
    public void exibirInformações(){
        System.out.println(
                "Nome: " + super.getNome() +
                "\nCPF: " + super.getCpf() + 
                "\nEndereço" + super.getEndereco() +
                "\nTelefone" + super.getTelefone() +
                "\nMatricula" + getMatricula()
        );
        
    }
}

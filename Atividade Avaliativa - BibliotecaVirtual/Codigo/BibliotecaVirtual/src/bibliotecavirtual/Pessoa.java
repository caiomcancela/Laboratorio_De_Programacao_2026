
package bibliotecavirtual;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;
    private String Telefone;

    public Pessoa(String nome, String endereco, String cpf, int idade, String Telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return Telefone;
    }
    
    
}

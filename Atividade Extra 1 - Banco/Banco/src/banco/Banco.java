package banco;

public class Banco {
    private int numero;
    private int agNumero;
    private String agNome;
    private String bancoNome;
    private int bancoNumero;
    private int tipo;
    private double saldo;
    
    public Banco(){
        this.saldo = 0.0d;
        this.tipo = 0;
                
    };

    public Banco(int numero, int agNumero, String agNome) {
        this.numero = numero;
        this.agNumero = agNumero;
        this.agNome = agNome;
        this.saldo = 0.0d;
        this.tipo = 0;
    }
    
    public int encerrarConta(){
        this.tipo = 4;
        return this.numero;
    }
    
    public String textoEncerrar(){
            return "Conta Encerrada!\nNumero da conta: " + this.numero + 
                    "\nTipo: " + this.tipo + "\nSaldo: " + saldo;
    }
    
    public String consultar_saldo(int numerodaConta){
        if(numerodaConta == numero ){
            return "Conta: " +this.numero + "  Saldo: R$" + this.saldo;
        }else{
            return "Conta Inesistente";
        }
    }
    
    public void creditar(double valor){
        this.saldo += valor;
    }
    
    public void debitar(double valor){
        this.saldo -= valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgNumero() {
        return agNumero;
    }

    public void setAgNumero(int agNumero) {
        this.agNumero = agNumero;
    }

    public String getAgNome() {
        return agNome;
    }

    public void setAgNome(String agNome) {
        this.agNome = agNome;
    }

    public String getBancoNome() {
        return bancoNome;
    }

    public void setBancoNome(String bancoNome) {
        this.bancoNome = bancoNome;
    }

    public int getBancoNumero() {
        return bancoNumero;
    }

    public void setBancoNumero(int bancoNumero) {
        this.bancoNumero = bancoNumero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    
}
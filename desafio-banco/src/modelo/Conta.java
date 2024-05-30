package modelo;
public abstract class Conta implements Iconta{
    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;

    protected int AGENCIA_PADRAO = 001;
    protected static int SEQUENCIAL = 1;

    @Override
    public void despositar(double valor) {
        this.saldo += valor;     
    }
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;        
    }
    @Override
    public void transferir(Conta conta, double valor) {
        this.sacar(valor);
        conta.despositar(valor);
    }
    @Override
    public void imprimirExtrato() {
    }
    protected void imprimirCabecalho() {
        System.out.println("Agencia: " + agencia + " - Número Conta: " + numero + " - Cliente: " + cliente.getNome());
    }
    public Conta() {
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}

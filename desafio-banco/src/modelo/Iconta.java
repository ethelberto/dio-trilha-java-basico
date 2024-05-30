package modelo;
public interface Iconta {
    void sacar(double valor);

    void despositar(double valor);

    void transferir(Conta conta, double valor);

    void imprimirExtrato();
}

package modelo;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super.cliente = cliente;
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    public void imprimirExtrato(){
        System.out.println("Extrato de Conta Corrente");
        System.out.println("=========================");
        super.imprimirCabecalho();
        System.out.println("   Saldo: " + saldo);
        System.err.println(" ");
    }

}

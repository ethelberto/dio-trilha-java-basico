package modelo;
public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente){
        super.cliente = cliente;
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }
   
    public void imprimirExtrato(){
        System.out.println("Extrato de Poupança");
        System.out.println("===================");
        super.imprimirCabecalho();
        System.out.println("   Valor Aplicado: " + saldo);
        System.err.println(" ");
    }
}

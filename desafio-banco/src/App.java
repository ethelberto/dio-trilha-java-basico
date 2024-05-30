import modelo.Banco;
import modelo.Cliente;
import modelo.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Banco santander = new Banco(33, "Santander");
        Cliente joao = santander.cadastrarCliente(1234, "Joao");
        Cliente maria = santander.cadastrarCliente(5678, "Maria");

        Conta contaJoao = santander.criarConta("cc", joao);
        Conta contaMaria = santander.criarConta("cp", maria);

        contaJoao.despositar(1000);
        contaJoao.sacar(100);
        contaJoao.transferir(contaMaria, 300);

        contaJoao.imprimirExtrato();
        contaMaria.imprimirExtrato();

        santander.relatorioDeContas();
    }
}

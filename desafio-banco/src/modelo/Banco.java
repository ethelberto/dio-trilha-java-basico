package modelo;
import java.util.List;
import java.util.ArrayList;

public class Banco {
    private int codigo;
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;
    
    public Banco(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
        this.contas = new ArrayList<Conta>();
    }
    public Cliente cadastrarCliente(int cpf, String nome){
        Cliente novoCliente = new Cliente(cpf, nome);
        clientes.add(novoCliente);
        return novoCliente;
    }
    public Conta criarConta(String tipo, Cliente cliente){
        Conta novaConta = null;
        if (tipo == "cc") {
            novaConta = new ContaCorrente(cliente);
        } else {
            novaConta = new ContaPoupanca(cliente);
        }
        contas.add(novaConta);
        return novaConta;
    }
    public void relatorioDeContas(){
        System.out.println("         BANCO " + nome);
        System.out.println("      Relatório de Contas");
        System.out.println("");
        for (Conta conta : contas) {
            System.out.println(" CLIENTE        AGÊNCIA/CONTA        SALDO");
            System.out.println(" =======        =============        =====");
            System.out.println(" " + conta.cliente.getNome() + "            " + conta.agencia + " / " + conta.numero + "               " + conta.saldo);
        }
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}

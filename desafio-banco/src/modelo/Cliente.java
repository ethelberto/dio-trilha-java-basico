package modelo;
public class Cliente {
    private int cpf;
    private String nome;

    public Cliente(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}

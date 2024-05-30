package set.operacoes_basicas;

public class TestarConjuntoConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Joao", 001);
        convidados.adicionarConvidado("Maria", 002);
        convidados.adicionarConvidado("Jose",003);
        convidados.adicionarConvidado("Duplicado", 002);

        convidados.removerConvidado(1);

        System.out.println("Existem " + convidados.contarConvidados() + " convidados.");

        convidados.exibirConvidado();

    }
}

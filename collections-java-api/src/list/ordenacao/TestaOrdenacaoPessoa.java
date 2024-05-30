package list.ordenacao;

public class TestaOrdenacaoPessoa {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Joao", 20, 1.8);
        ordenacaoPessoas.adicionarPessoa("Maria", 26, 1.6);
        ordenacaoPessoas.adicionarPessoa("Ana", 10, 1.5);

        System.out.println(ordenacaoPessoas.getListPessoas());

        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }
}

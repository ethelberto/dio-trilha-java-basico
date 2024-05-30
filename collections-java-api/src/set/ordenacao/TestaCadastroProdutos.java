package set.ordenacao;

public class TestaCadastroProdutos {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(1l, "Produto 4", 1, 1);
        cadastro.adicionarProduto(2l, "Produto 3", 2, 2);
        cadastro.adicionarProduto(3l, "Produto 2", 3, 3);
        cadastro.adicionarProduto(4l, "Produto 1", 4, 4);

        System.out.println(cadastro.exibirProdutosPorNome());

        System.out.println(cadastro.exibirProdutosPorPreco());

    }
}

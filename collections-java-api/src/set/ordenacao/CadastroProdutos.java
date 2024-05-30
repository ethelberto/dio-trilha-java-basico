package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> setProdutos;

    public CadastroProdutos() {
        this.setProdutos = new HashSet<>();
    }
    
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        Produto produto = new Produto(codigo, nome, preco, quantidade);
        setProdutos.add(produto);
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(setProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(setProdutos);
        return produtosPorPreco;
    }
}

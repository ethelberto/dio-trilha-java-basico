package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listLivros = new ArrayList<>();

    public CatalogoLivros(){
        this.listLivros = new ArrayList<>();
    }

    // Adiciona um livro ao catálogo
    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        listLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Pesquisa o catálogo por um título e retorna o primeiro que encontar.
    public Livro pesquisaPorTitulo(String titulo){
        Livro livro = null;
        if(!listLivros.isEmpty()){
            for (Livro l : listLivros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livro = l;
                }
            }    
        }   
        return livro;
    }

    // Retorna Lista de Livros por Autor
    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> listaLivrosPorAutor = new ArrayList<>();
        if(!listLivros.isEmpty()){
            for (Livro l : listLivros) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    listaLivrosPorAutor.add(l);
                }
                
            }
        }
        return listaLivrosPorAutor;
    }

    // Retorna Lista em um Intervalo de Anos de publicação
    public List<Livro> pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> listaLivrosPorIntervalo = new ArrayList<>();
        if(!listLivros.isEmpty()){
            for (Livro l : listLivros) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    listaLivrosPorIntervalo.add(l);
                }
                
            }
        }
        return listaLivrosPorIntervalo;
    }

}

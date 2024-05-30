package list.pesquisa;

public class TestaCatalogoLivros {

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivros("Titulo 1", "Eu", 2020);
        catalogoLivros.adicionarLivros("Titulo 2", "Tu", 2021);
        catalogoLivros.adicionarLivros("Titulo 3", "Tu", 2021);
        catalogoLivros.adicionarLivros("Titulo 4", "Ele", 2022);

        System.out.println("Pesquisa por Título");
        System.out.println(catalogoLivros.pesquisaPorTitulo("Titulo 2"));
        System.out.println("Pesquisa por Autor");
        System.out.println(catalogoLivros.pesquisaPorAutor("Tu"));
        System.out.println("Pesquisa por Intervalo");
        System.out.println(catalogoLivros.pesquisaPorIntervaloDeAnos(2020, 2021));
    }

}

public class TestandoIphone {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        AparelhoTelefonico telefone = iphone;
        NavegadorInternet navegador = iphone;
        ReprodutorMusical reprodutor = iphone;

        String numero = "(11)9999-12345";
        telefone.atender(numero);
        telefone.ligar(numero);
        telefone.iniciarCorreioVoz(numero);

        String url = "www.dio.com";
        navegador.adicionarNovaAba(url);
        navegador.atualizarPagina(url);
        navegador.atualizarPagina(url);

        reprodutor.selecionarMusica();
        reprodutor.tocar();
        reprodutor.pausar();
    }
}

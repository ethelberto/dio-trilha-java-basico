/**
 * @(#) Iphone.java
 */

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet
{
	@Override
	public void ligar( String numero )
	{
		System.out.println("Ligando para o número: " + numero);
	}
	@Override
	public void atender( String numero )
	{
		System.out.println("Atendendo o número: " + numero);	
	}
	@Override
	public void iniciarCorreioVoz( String numero )
	{
		System.out.println("Iniciando Correio de Voz do número: " + numero);	
	}
	@Override
	public void tocar( )
	{
		System.out.println("Tocando Música...");	
	}
	@Override
	public void pausar( )
	{
		System.out.println("Pausando Música...");	
	}
	@Override
	public void selecionarMusica( )
	{
		System.out.println("Selecionando Música...");
	}
	@Override
	public void exibirPagina( String url )
	{
		System.out.println("Exibindo Página..." + url);
	}
	@Override
	public void adicionarNovaAba( String url )
	{
		System.out.println("Adicionando Página..." + url);	
	}
	@Override
	public void atualizarPagina( String url )
	{
		System.out.println("Atualizando Página..." + url);	
	}
	
	
}

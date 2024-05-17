import java.util.Locale;
import java.util.Scanner;
    /**
    * <h1>Conta Terminal</h1>
    * A Classe Conta Terminar ira permitir a entrada dos dados de uma conta e exibí-los
    * <p>
    * <b>Nota:</b> Esse é um projeto do Bootcamp da Dio - Santander Java BackEnd
    * 
    * @author Ethelberto
    * @version 1.0
    * @since 09/05/2024
    */
public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, entre com número da Agência: ");
        String agenciaDaConta =scanner.next();

        System.out.println("Por favor, entre com número da Conta: ");
        Integer numeroDaConta =scanner.nextInt();

        System.out.println("Digite seu nome");
        String nomeDoCliente = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenomeDoCliente = scanner.next();

        System.out.println("Digite o saldo da conta:");
        Double saldoDaConta = scanner.nextDouble();

        System.out.println("\"Olá " + nomeDoCliente + " " + sobrenomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaDaConta + ", conta " + numeroDaConta + " e seu saldo " + saldoDaConta + " já está disponível para saque\".");
    }
}

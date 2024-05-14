import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Entre com o primeiro número: ");
            int parametroUm   = terminal.nextInt();
            System.out.println("Entre com o segundo número: ");
            int parametroDois = terminal.nextInt();
                
            try{
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e){
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");;
            }
        }  catch (InputMismatchException e){
            System.out.println("Por favor, entre com valor numerico.");
        }    
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        System.out.println("==================== Iniciando a Impressão ===================");
        int contador = 0;
        for (int indice = parametroUm; indice < parametroDois; indice++) {
            contador++;
            System.out.println("Imprimindo o número: " + contador);
        }
        System.out.println("======================= Fim da Impressão ======================");
    
    }
}

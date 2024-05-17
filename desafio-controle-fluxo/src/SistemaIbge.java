public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadosBrasileiros estado: EstadosBrasileiros.values()) {
            System.out.println("Sigla: " + estado.getSigla() + " Nome: " + estado.getNome());
            if(estado == EstadosBrasileiros.RIO_JANEIRO) {
                System.out.println("Cidade Maravilhosa: " + estado.getNomeMaiusculo());
            }
        }    
    }
}

package gof.strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.err.println("Movendo Normalmente");
    }
}

package gof.singleton;
public class SingletonEager {
    private static SingletonEager instancia;

    private SingletonEager () {
        instancia = new SingletonEager();
    }

    public static SingletonEager getInstancia(){
            return instancia;
    }
}

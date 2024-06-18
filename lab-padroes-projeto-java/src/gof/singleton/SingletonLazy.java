package gof.singleton;
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy () {
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null) {
            return instancia = new SingletonLazy();
        } else {
            return instancia;
        }
    }
}

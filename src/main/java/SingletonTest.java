class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        // do some non-trivial initialization
        System.out.println("Singleton()");
    }
}

enum SingletonEnum {
    INSTANCE;

    SingletonEnum() {
        // do some non-trivial initialization
        System.out.println("SingletonEnum()");
    }

    public void someMethod() {
        return;
    }
}

public class SingletonTest {
    public static void main(String args[]) {
        Singleton s = Singleton.INSTANCE;
        SingletonEnum se = SingletonEnum.INSTANCE;
    }
}
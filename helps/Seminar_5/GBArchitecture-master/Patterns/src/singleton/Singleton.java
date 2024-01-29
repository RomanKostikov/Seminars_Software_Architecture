package singleton;

public class Singleton {
    private static Singleton INSTANCE;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    // холдер для класса

//    private static final class InstanceHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//
//    public static Singleton getInstance() {
//        return InstanceHolder.INSTANCE;
//    }
}

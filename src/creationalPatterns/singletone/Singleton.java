package creationalPatterns.singletone;

/**
 * This pattern guaranties that class can only have one
 * instance and provides a global access point to it
 */

public class Singleton {

    //why volatile? check multy-thread version of getInstance
    private static volatile Singleton instance;
    public String value;

    static {
        System.out.println("static initialization (any static fields can be initialized here)");
    }

    protected Singleton(String value) {
        this.value = value;
    }

    /**
     * Works fine in single-thread applications, but can
     * grant you multiple instances of singletone in multi-thread cases
     */
    public static Singleton getInstance(String value) {
        if (instance == null)
            instance = new Singleton(value);
        return instance;
    }

    /**
     * This version fixes troubles with multithreadind using Double-Checked locking
     * previously we've declared instance as volatile - it is essential requirement for
     * locking to work correctly. DCL has some troubles in Java, and for that reason I'm using
     * a reduntant variable result.
     * Check more: https://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java
     */
    public static Singleton getInstanceMultiThread(String value) {
        Singleton result = instance;
        if (result != null)
            return result;
        synchronized (Singleton.class) {
            if (instance == null)
                instance = new Singleton(value);
            return instance;
        }
    }

}

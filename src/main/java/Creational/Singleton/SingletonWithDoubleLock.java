package Creational.Singleton;

public class SingletonWithDoubleLock {
    /*** volatile --> wonot store anything in core's cache directly write  into the memory.
     * The volatile keyword ensures that multiple threads
     * handle the uniqueInstance variable correctly when it
     * is being initialized to the Singleton instance. ***/
    private volatile static SingletonWithDoubleLock instance;


    private SingletonWithDoubleLock() {
    }

    public static SingletonWithDoubleLock getInstance() {
        if (instance == null) {
            System.out.println("Initialized for the first time");
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new SingletonWithDoubleLock();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonWithDoubleLock.getInstance());
        System.out.println(SingletonWithDoubleLock.getInstance());
        System.out.println(SingletonWithDoubleLock.getInstance());
    }


}

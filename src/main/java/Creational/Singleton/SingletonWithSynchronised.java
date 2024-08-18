package Creational.Singleton;

public class SingletonWithSynchronised {
    private static SingletonWithSynchronised instance;

    private SingletonWithSynchronised(){}

    public static synchronized SingletonWithSynchronised getInstance(){
        System.out.println("Thread Name" + Thread.currentThread().getName());
        if(instance == null){
            instance = new SingletonWithSynchronised();
        }
        return instance;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
            System.out.println(SingletonWithSynchronised.getInstance());
        });
        t1.start();

        Thread t2 = new Thread(()-> {
            System.out.println(SingletonWithSynchronised.getInstance());
        });
        t2.start();
    }

}

package Creational.Singleton;
/*** Lazy initialization Not thread safe ***/

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){
    }

    public static SingletonLazy getInstance(){
        if (instance == null){
            instance =  new SingletonLazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonLazy.getInstance());
        System.out.println(SingletonLazy.getInstance());
        System.out.println(SingletonLazy.getInstance());
    }
}

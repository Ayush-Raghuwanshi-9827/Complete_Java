package Creational_Patterns;

// Eager way to create Singleton Object
public class Singleton1 {

    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getSingleton1(){
        return singleton1;
    }
    
}

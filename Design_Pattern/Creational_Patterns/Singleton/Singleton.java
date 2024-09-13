package Creational_Patterns;

public class Singleton {

    
    // Create a instance of object so only one object is created
    private static Singleton singleton;


    private Singleton() {
        // Private constructor to restrict instantiation
    }

    // get Method by which developer can access the object
    // but this approch is lazy way Beacuse when user call the getSingleton() method then object is created.
    // but this method is not thread safe beacuse if two thread enter in this method two object is created.
    public static Singleton getSingleton(){
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    // Thread safe 
    public static Singleton getSingleton2(){
        if (singleton == null) {
            synchronized(Singleton.class){

                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
     

}
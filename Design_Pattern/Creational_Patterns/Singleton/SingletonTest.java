package Creational_Patterns;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());

        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2.hashCode());


        System.out.println();
        
        Singleton1 Eager_singleton = Singleton1.getSingleton1();
        System.out.println(Eager_singleton.hashCode());
        
        Singleton1 Eager_singleton1 = Singleton1.getSingleton1();
        System.out.println(Eager_singleton1.hashCode());

        
    }

}

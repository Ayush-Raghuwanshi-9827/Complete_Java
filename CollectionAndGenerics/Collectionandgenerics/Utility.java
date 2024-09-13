package Collectionandgenerics;
import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> coll){
        for (E e : coll) {
            System.out.print(e +" ");
        }
        System.out.println();
    } 
}

package Collectionandgenerics;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class LisstInterface {
    public static void main(String[] args) {
        // List str = new ArrayList<>();
        // str.add("Prashant");
        // str.add("Raghuwanshi");
        // str.add(1,"Singh");
        // // str.remove();
        // for(int i=0; i< str.size(); i++){
        // System.out.println(str.get(i));
        // }
           
        // ArrayList objects -> Arraylist Extemds List interface
        List<Integer> ll = new ArrayList<>();
        ll.add(6);
        ll.add(4);
        ll.add(3);
        ll.add(9);
        ll.add(55);
        System.out.println(ll);
        Iterator<Integer>  itr = ll.iterator();
        System.out.println("List Elements are : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("Size of the list is : " + ll.size());
        System.out.println("Remove the Element of any index and print that element: " + ll.remove(3));
        System.out.println(ll);
        System.out.println("Check any element present in the list or not : " + ll.contains(3));
        
    }
    
}

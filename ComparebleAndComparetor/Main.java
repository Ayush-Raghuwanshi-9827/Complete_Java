import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){

        ArrayList<Emp> emps = new ArrayList<Emp>();

         emps.add( new Emp("Ayush", 101, "IT"));
         emps.add( new Emp("Ansh", 102, "IT"));
         emps.add(new Emp("Tanish", 103, "IT"));
         emps.add(new Emp("Rainbow", 104, "IT"));

        // System.out.println(emps);

        // Sorting the ArrayList based on id in ascending order
        // emps.sort(null);
        // System.out.println("Sorted by Name: " + emps);

        Collections.sort(emps, new ComaparatorInterface());
        System.out.println(emps);
    }


    
}

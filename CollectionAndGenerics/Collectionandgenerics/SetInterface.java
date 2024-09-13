package Collectionandgenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.MediaSize.NA;

public class SetInterface {
    /*
     * -> Unique Elements => Does not allow duplicates elements.
     * ->  Unordered Collection:it does not guarantee any specifc ordering of elements.
     * -> No Positional Excess : Unlike lists, it does'nt support indxig based  acess to elements. 
     * -> Implementation : hashset, LinkedHashSet, TreeSet.
     */
   public static void main(String[] args) {
    Set<String> Names = new HashSet<>();
    Names.add("Ayush Raghuwanshi");
    Names.add("Rainbow Badmash");
    Names.add("Ansh Lodhi");
    // Utility.print(Names);
    System.out.println(Names);
    System.out.println(Names.add("Ayush Raghuwanshi"));
    
      
   }   
}

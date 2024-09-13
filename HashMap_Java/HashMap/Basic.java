package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Basic {

    public static void main(String[] args) {
        // Syntax for creating a hashMap
        HashMap<String,Integer> hm = new HashMap<>();
        // put method is for Insertion if key id not exist and updation if key is already present.
        hm.put("Akash", 21);
        hm.put("Yash", 16);
        hm.put("Ayush", 17);
        hm.put("Priya", 18);
        hm.put("Lovely", 21);


        // get method is return value if key is exist and null if key does'nt exist
        System.out.println(hm.get("Yash"));
        System.out.println(hm.get("Akash"));
        hm.put("Akash", 44);
        System.out.println(hm.get("Akash"));

        // For delet a Pair
        System.out.println(hm.remove("Akash"));

        // chek if key in exist or not
        System.out.println(hm.containsKey("Akash"));
        System.out.println(hm.containsKey("Yash"));

        // putIfAbsent - first check key is present or not if key is present so this key and value is added
        hm.putIfAbsent("Akash", 55);
        System.out.println(hm.get("Akash"));

        // get all the key in the hashMap
        System.out.println(hm.keySet());

        // get all the value in the hashmap
        System.out.println(hm.values());

        // get all the entries in the hashMAp
        System.out.println(hm.entrySet());

        // traversing all the entries of hashMap - Multiple methods
        for(String key : hm.keySet()){
            System.out.printf("Age of %s is %d", key, hm.get(key));
            System.out.println();
        }
        System.out.println();

        for(Map.Entry<String, Integer> e : hm.entrySet()){
             System.out.printf("Age of %s is %d \n", e.getKey(), e.getValue());
        }
        System.out.println();

     }
    // map interface are mainly three important class
    // 1 - hashMap => unordered and unsorted
    // 2 - LinkedHashMap => ordered but unsorted
    // 3 - treeMAp => sorted but unordered
}
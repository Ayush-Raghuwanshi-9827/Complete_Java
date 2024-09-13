import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementationOfHashmap {
    static class MyHashMap<K , V> { // generics
         private class Node {
             K key;
             V value;

             public Node(K key, V value){
                this.key = key;
                this.value = value;
             }
         }

         private int n; // size of nodes or entries 
         private int N; // size of array of linkedList
         private LinkedList<Node> buckets[]; // N = Buckets.Length

         @SuppressWarnings("unchecked")
         public MyHashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
         }
         private int hashFunction(K key){
            int bi =  key.hashCode();
            return Math.abs(bi)% N;
         }

         private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
         }

         public void put(K key, V value){
             int bi = hashFunction(key);
             int di = searchInLL(key, bi);
             if(di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
             }else {
                Node data = buckets[bi].get(di);
                data.value = value;
             }

             double lambda = (double) n/ N;
             if(lambda > 2.0) {
                //  rehashing
                rehashing();
             }
         }
         private void rehashing(){
                LinkedList<Node> oldBuckets[] = buckets; 
                buckets = new LinkedList[N*2];

                for(int i=0; i < N*2; i++){
                    buckets[i] = new LinkedList<>();
                }

                for(int i=0; i < oldBuckets.length; i++){
                    LinkedList<Node> ll = oldBuckets[i];
                    for(int j=0; j < ll.size(); j++){
                        Node node = ll.get(j);
                        put(node.key, node.value);
                    }
                }
         }

         public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i< buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j < ll.size(); j++){
                   Node node = ll.get(j);
                   keys.add(node.key);
                }
            }
            return keys;
         }

         public boolean isEmpty(){
            return n==0;
         }

         public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
             if(di == -1){
                return false;
             }else {
                return true;
             }
         }

         public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
             if(di == -1){
                return null;
             }else {
                Node data = buckets[bi].remove(di);
                n--;
                return data.value;
             }
         }

         public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
             if(di == -1){
                return null;
             }else {
                Node data = buckets[bi].get(di);
                return data.value;
             }
         }   
    }
    public static void main(String[] args) {
        MyHashMap<String , Integer> hm = new MyHashMap<>();
        hm.put("India", 55);
        hm.put("china", 155);
        hm.put("USA", 52);
        hm.put("Isreal", 2);
        hm.put("Pakistan",22);
        ArrayList<String> keys = hm.keySet();
        for(int i=0; i < keys.size(); i++){
            System.out.println(keys.get(i) + " " + .get(keys.get(i)));
        }
        
    }
}

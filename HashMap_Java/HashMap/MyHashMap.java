package HashMap;

import java.util.LinkedList;
import java.util.Objects;

public class MyHashMap<K, V> {
    class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString() {
            return key + " : " + value;
        }
    }

    LinkedList<Node> hashTable[];
    private int elements;
    private int tableSize;
    private double threshold;

    private void initializeHashTable() {
        for (int i = 0; i < tableSize; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    MyHashMap() {
        elements = 0;
        tableSize = 16;
        threshold = 0.75;
        hashTable = new LinkedList[tableSize];
        initializeHashTable();
    }

    public void put(K key, V value) {
        int hashCode = findHashCode(key);
        int index = searchKeyInList(key, hashCode);
        Node node = new Node(key, value);
        if (index == -1) {
            hashTable[hashCode].add(0, node);
            elements++;
        } else {
            hashTable[hashCode].get(index).value = value;
            elements++;
        }
        if (elements / (double) tableSize >= threshold) {
            rehash();
        }
    }

    private void rehash() {
        LinkedList<Node> oldTable[] = hashTable;
        elements = 0;
        tableSize = 2 * tableSize;
        hashTable = new LinkedList[tableSize];
        initializeHashTable();
        for (LinkedList<Node> list : oldTable) {
            for (Node node : list) {
                put(node.key, node.value);
            }
        }

    }

    private int searchKeyInList(K key, int hashCode) {
        LinkedList<Node> list = hashTable[hashCode];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private int findHashCode(K key) {
        int hashCode = Objects.hash(key);
        hashCode = Math.abs(hashCode);
        hashCode = hashCode % tableSize;
        return hashCode;
    }

    public V get(K key) {
        int hashCode = findHashCode(key);
        int index = searchKeyInList(key, hashCode);
        if (index == -1) {
            return null;
        } else {
            return hashTable[hashCode].get(index).value;
        }
    }
   
    public boolean ContainsKey(K key){
        int hashCode = findHashCode(key);
        int index = searchKeyInList(key, hashCode);
        if (index == -1) {
            return false;
        } else {
            return true;
        }
    } 

    public V remove(K key){
        int hashCode = findHashCode(key);
        int index = searchKeyInList(key, hashCode);
        if (index == -1) {
            return null;
        }else {
            V value = hashTable[hashCode].get(index).value;
            hashTable[hashCode].remove(index);
            elements--;
            return value;
        }
    }

    public void iterate(){
        for (LinkedList<Node> linkedList : hashTable) {
           for (Node node : linkedList) {
               System.out.println(node);
           }
        }
    }
 
    public boolean isEmpty(){
        return elements==0;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> hm = new MyHashMap<>();
        hm.put(1, "Ayush");
        hm.put(2, "Tanisha");
        hm.put(3, "Vijay");
        hm.put(4, "Ekta");
        hm.put(5, "Himanshu");
        hm.put(6, "Rahul");
 
        System.out.println(hm.get(1));
        System.out.println(hm.get(3));

        System.out.println(hm.isEmpty());
        hm.iterate();
        System.out.println(hm.ContainsKey(3));


    }

}


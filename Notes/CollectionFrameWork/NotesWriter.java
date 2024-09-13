package CollectionFrameWork;
import java.util.Collection;
import java.util.Scanner;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;

public class NotesWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name of the file with .txt : ");
        String fileName = sc.nextLine();
        try(FileWriter NotesWriter = new FileWriter(fileName)){
            NotesWriter.write("List Interface ->\r\n" + //
                                "1. The List interface in Java provides a way to store the ordered collection. \r\n" + //
                                "2. It is a child interface of Collection. \r\n" + //
                                "3. It is an ordered collection of objects in which duplicate values can be stored. \r\n" + //
                                "4. Since List preserves the insertion order, it allows positional access \r\n" + //
                                "   and insertion of elements.\r\n" + //
                                "5. It is a factory of ListIterator interface. \r\n" + //
                                "6. Through the ListIterator, we can iterate the list in forward \r\n" + //
                                "   and backward directions. \r\n" + //
                                "7. The implementation classes of the List interface are ArrayList, LinkedList,\r\n" + //
                                " Stack, and Vector. \r\n" + //
                                "8. The Vector class is deprecated since Java 5.\r\n" + //
                                "\r\n" + //
                                "Signature of List interface -> \r\n" + //
                                "public interface List<E> extends Collection<E>;\r\n" + //
                                "\r\n" + //
                                "How do we initialize an interface?\r\n" + //
                                "1. List<Obj> list1 = new ArrayList<Obj> ();\r\n" + //
                                "2. List<Obj> list2 = new LinkedList<Obj> ();\r\n" + //
                                "3. List<Obj> list3 = new Vector<Obj> ();\r\n" + //
                                "and so on..\r\n" + //
                                "\r\n" + //
                                "Some basic functionalities ->\r\n" + //
                                "list1.add(obj);\r\n" + //
                                "list1.add(index, obj); //move objects to right (index to N)\r\n" + //
                                "list1.set(index, obj); //update value at index\r\n" + //
                                "list1.remove(obj); /remove obj [ first occurance in case of multiple ]\r\n" + //
                                "list1.remove(1); //move objects to the left\r\n" + //
                                "equals(obj); // equates the objects with all the elements.\r\n" + //
                                "sort(comparator); // sorts the collection on the basis of comparator\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "ArrayList class->\r\n" + //
                                "1. It is just like a dynamic Array.\r\n" + //
                                "2. It has initial capacity of 10.\r\n" + //
                                "3. It increases its capacity with n + n/2 +1 formula.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Stack class->\r\n" + //
                                "1. It follows Last in first out methodology.\r\n" + //
                                "2. Push , pop, peek are some commonly used methods.\r\n" + //
                                "3. It also follows capacity logic.\r\n" + //
                                "\r\n" + //
                                "Linked List class ->\r\n" + //
                                "Queue and List both interfaces can be implemented by LinkedList class->\r\n" + //
                                "1. Elements are not stored in the memory in contiguous fashion.\r\n" + //
                                "2. LinkedList class internally uses the doubly linked list.\r\n" + //
                                "3. It does not follow the capacity logic as linked list are purely dynamic in nature.\r\n" + //
                                "\r\n" + //
                                "Bonus points ->\r\n" + //
                                "1. ListIterator Interface is used to traverse the element in a backward and forward direction.\r\n" + //
                                "\r\n" + //
                                "How to create a list iterator\r\n" + //
                                "\r\n" + //
                                "List<String> myList=new ArrayList<String>();    \r\n" + //
                                "ListIterator<String> itr=myList.listIterator();\r\n" + //
                                "\r\n" + //
                                "Functionalities of List Iterator ->\r\n" + //
                                "a. hasPrevious() / hasNext()\r\n" + //
                                "b. previous() / next()\r\n" + //
                                "\r\n" + //
                                "What is the Difference between ArrayList and LinkedList ->\r\n" + //
                                "\r\n" + //
                                "1) ArrayList internally uses a dynamic array to store the elements.\t\r\n" + //
                                "LinkedList internally uses a doubly linked list to store the elements.\r\n" + //
                                "\r\n" + //
                                "2) Manipulation with ArrayList is slow because it internally uses an array. \r\n" + //
                                "If any element is removed from the array, all the other elements are shifted \r\n" + //
                                "in memory.\t\r\n" + //
                                "Manipulation with LinkedList is faster than ArrayList because it uses \r\n" + //
                                "a doubly linked list, so no bit shifting is required in memory.\r\n" + //
                                "\r\n" + //
                                "3) An ArrayList class can act as a list only because it implements List only.\r\n" + //
                                "LinkedList class can act as a list and queue both because it implements \r\n" + //
                                "List and Deque interfaces.\r\n" + //
                                "\r\n" + //
                                "4) ArrayList is better for storing and accessing data.\t\r\n" + //
                                "LinkedList is better for manipulating data.\r\n" + //
                                "\r\n" + //
                                "5) The memory location for the elements of an ArrayList is contiguous.\t\r\n" + //
                                "The location for the elements of a linked list is not contagious.\r\n" + //
                                "\r\n" + //
                                "6) Generally, when an ArrayList is initialized, a default capacity of 10 \r\n" + //
                                "is assigned to the ArrayList.\t\r\n" + //
                                "There is no case of default capacity in a LinkedList. \r\n" + //
                                "In LinkedList, an empty list is created when a LinkedList is initialized.\r\n" + //
                                "\r\n" + //
                                "7) To be precise, an ArrayList is a resizable array.\t\r\n" + //
                                "LinkedList implements the doubly linked list of the list interface.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Which classes implement the List Interface? \r\n" + //
                                "\r\n" + //
                                "1. AbstractList: When one wants to create an unmodifiable list, this AbstractList class needs to be extended.\r\n" + //
                                "Methods to be implemented are get() and size(). \r\n" + //
                                "\r\n" + //
                                "2. CopyOnWriteArrayList: When one wants to create an ArrayList but after implementing the functions like add, set, etc, they want a fresh copy of the list, in that case CopyOnWriteArrayList class needs to be extended.\r\n" + //
                                "Methods to be implemented are same as that of ArrayList.\r\n" + //
                                "\r\n" + //
                                "3. AbstractSequentialList: This class implements the Collection interface and the AbstractCollection class. This class is used to implement an unmodifiable list, for which one needs to only extend this AbstractList Class and implement only the get() and the size() methods.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "");
        }catch(IOException e){
            System.out.printf("Exception Occured %s", e.getMessage());
        }
    }
    
}
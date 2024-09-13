package Collectionandgenerics;
import java.util.*;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueInterface {
     public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.offer(3);
        queue.offer(5);
        queue.offer(55);
        // for(Integer i : queue) System.out.printf("%d", i); 
        Utility.print(queue);
        queue.poll();
        Utility.print(queue);
        queue.poll();
        Utility.print(queue);

     }    
}

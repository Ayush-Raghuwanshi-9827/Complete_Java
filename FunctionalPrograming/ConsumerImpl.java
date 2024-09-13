
import java.util.function.*;
public class ConsumerImpl {
    
    public static void main(String[] args) {
        
        //Consumer only accepts the data and never returns anything
        //It has abstract method accept()

        Consumer<Integer> consumer = (data) -> System.out.println("Received data: " + data);
        consumer.accept(6);

        // Consumer channing andThen()
        Consumer<Integer> consumer2 = (data) -> System.out.println(data * data);
        consumer2.andThen(consumer2).accept(4);
       
    }
}

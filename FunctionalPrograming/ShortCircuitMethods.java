import java.util.Arrays;
import java.util.List;

public class ShortCircuitMethods {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,6,7,2,32,43,432);

        //n Java Streams, the limit() operation is used to truncate the stream to contain only a specified number of elements. It's a way to control the number of elements you want to process from a larger collection
        // It return a Stram with the first n elements form the orginal stram
        //It works sequentially, and it is an intermediate operation beacuse it reutrn the stream


        list.stream().filter(a -> a%2 == 0).map( a -> a * a).limit(2).forEach(System.out::println);

       
        char c = '*';
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (2*i)+1; k++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

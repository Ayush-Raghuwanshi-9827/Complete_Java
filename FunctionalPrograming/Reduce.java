import java.util.List;

public class Reduce {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        System.out.println(numbers.stream().reduce((a,b) -> a*b).get());
    }
}


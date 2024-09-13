import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
 public static void main(String[] args) {
    List<Integer> l1 = List.of(2,43,55,67,8,82);
    int sum = 0;
    for (Integer number : l1) {
        sum += number;
    }
    System.out.println("Normal sum using for each "+ sum);

    int newsum = l1.stream()
        .reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) {
                return t + u;
            }
        });
        System.out.println("Sum using reduce "+newsum);

    int newsum2 = l1.stream()
            .reduce(0, (a,b) -> a+b);
        System.out.println("Sum using reduce and lambda "+ newsum2);

    int max = l1.stream()
             .reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b);

        System.out.println("max Element in list : " + max);
  }   
}

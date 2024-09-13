import java.util.List;
import java.util.function.BinaryOperator;

public class Practice {
    public static void main(String[] args) {
        BinaryOperator<Integer> mult = (a,b) -> a * b;
        int res = mult.apply(4, 6);
        System.out.println(res);

        List arr = List.of("aplle","Tanu","Rahul","Ayuuu","Rainbow");
        arr.stream().forEach(name -> System.out.println(name));
             

    }
}

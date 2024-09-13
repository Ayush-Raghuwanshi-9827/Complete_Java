import java.util.function.*;
public class FunctionImpl {
    
    public static void main(String[] args) {

        //Function is also a functional Interface. It take one argument and 
        // return one value.
        // In this example, Function takes an integer and returns Integer.
        // The abstract method is apply();

        
        Function<Integer, Integer> function = i -> i *2;

        System.out.println(function.apply(2));


        //Function channing 
        // By function channing we can use multiple functions together to perform different operations
        // Here, we multiply the result of function.apply(2) by 3.
        Function<Integer, Integer> multiplyByThree = i -> i*i*i;

        //andThen first perform the first function and then second function
        System.out.println(function.andThen(multiplyByThree).apply(2));
        //compose first perform the second function and then the first function
        System.out.println(function.compose(multiplyByThree).apply(2));

    }
}

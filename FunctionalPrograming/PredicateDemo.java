
import java.util.function.Predicate;
public class PredicateDemo {
   
    public static void main(String[] args) {
        // predicate is a Predifined Functional Interface
        // Its only has one abstract method "public Boolean test(T t)"
        // When a boolean is tested we use the predicate

        Predicate<String> predicate = (s) -> s.length() > 5;
        // System.out.println("Using Predicate : "+ predicate.test("Ayush"));

        // Predicate Joining
        // Three ways to join ("And", "Or", "Negate")

        Predicate<String> predicate2 = (s) -> s.length()%2 ==0;

        Boolean ans = predicate.and(predicate2).test("Ayush Raghuwanshii");
   
        Boolean ans1 = predicate.or(predicate2).test("Ayush Raghuwanshi");

        Boolean ans2 = predicate.negate().test("Ayus");
        System.out.println(ans2);
    }
}

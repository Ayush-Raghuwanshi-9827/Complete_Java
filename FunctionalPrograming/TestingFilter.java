import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruit = List.of("Apple", "Banana", "Mango", "Orange");
        System.out.println("Printing fruits normally");
        for (String fruits : fruit) {
            System.out.println(fruits);
        }
        System.out.println("Printg fruits using stream ");
        fruit.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        System.out.println("Another method using stream and lambda");
        fruit.stream().forEach(fruits -> System.out.println(fruits));

        // filter -> filter the stream
        System.out.println("Printing fruits using filter");
        fruit.stream()
            .filter(fruits -> !fruits.endsWith("e"))
            .forEach(fruits -> System.out.println(fruits));
            
    }
}
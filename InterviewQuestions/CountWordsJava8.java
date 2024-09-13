import java.util.Arrays;

public class CountWordsJava8 {
    public static void main(String[] args) {
        String str = "I am learning Java! 8";
        long count = Arrays.stream(str.split("\\s+")).count();
        System.out.println(count);
    }
}

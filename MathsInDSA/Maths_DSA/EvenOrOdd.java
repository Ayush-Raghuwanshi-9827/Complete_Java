public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(-3));
    }
    public static Boolean isOdd(int n){
        return (n & 1) == 1;
    }
}

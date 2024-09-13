public class PrintBit{
    public static void main(String[] args) {
        printbit(35);
    }
    public static void printbit(int num){
        for (int i = 7; i >= 0 ; i--) {
            System.out.print((num >> i) & 1);
        }
    }
}
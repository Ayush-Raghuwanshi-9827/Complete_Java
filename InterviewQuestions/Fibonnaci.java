public class Fibonnaci{
    public static void main(String[] args) {
        int n = 10;
        int f = 0;
        int s = 1;
        System.out.println("Printing Fibonnaci series till n");
        for(int i=0; i < 10; i++){
            System.out.print(f + " ");
           int next = f + s;
           f = s;
           s = next;
        }
    }
}
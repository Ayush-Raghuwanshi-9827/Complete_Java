public class printPattern{
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++){
            for(int j = i; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
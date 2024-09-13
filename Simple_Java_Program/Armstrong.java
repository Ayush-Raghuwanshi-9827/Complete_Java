import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // System.out.println(checkArms());

        for(int i = 100; i < 1000; i ++){
            if(checkArms(i)){
                System.out.println(i);
            }
        }

    }
    static boolean checkArms(int n){
         int Orignal = n;
         int sum = 0;
         while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
         }
         return sum == Orignal;
    }
}

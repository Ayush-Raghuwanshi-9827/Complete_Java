public class QuestionSeven {
    // Print that pattern with loops
    /*
               *
              * *
             * * *
            * * * *
           * * * * *
     */
    public static void main(String[] args) {
        int n = 5;
        pattern7(n);
    }
    static void pattern7(int n){
        for(int row = 0; row < n; row ++){
            int noOfSpaces = n - row +1;
            for(int s=0; s < noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int col =0; col < row +1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

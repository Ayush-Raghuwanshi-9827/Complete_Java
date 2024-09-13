public class QuestionEight {
    // Print that pattern with loops
    /*
       * * * * *
        * * * *
         * * *
          * *
           *

     */
    public static void main(String[] args) {
        int n = 5;
        patter8(n);

    }
    static void patter8(int n){
        for(int row=0; row < n; row++){
            int spaces = row;
            for(int s=0; s < row; s++){
               System.out.print(" ");
            }
            for(int col=0; col < n - row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

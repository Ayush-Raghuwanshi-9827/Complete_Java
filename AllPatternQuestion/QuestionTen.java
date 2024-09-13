public class QuestionTen {
    // Print that pattern with java
 /*
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
*/
    public static void main(String[] args) {
       int n = 5;
       patter10(n);
    }
    static void patter10(int n){
      for(int row=0; row < 2 * n; row++){
       
        int totalColsInRow = row > n -1 ? row - n +1: n - row;
         int spaces = row > n -1 ? n - totalColsInRow: row;
        for(int s = 0; s < spaces; s++){
            System.out.print(" ");
        }
        for(int col=0; col < totalColsInRow; col++){
            System.out.print("* ");
        }
        System.out.println();
      }
    }
}

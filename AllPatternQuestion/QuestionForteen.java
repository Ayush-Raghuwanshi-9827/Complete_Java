public class QuestionForteen {
    // print this pattern using loops
    /*
           1
          212
         32123
        4321234
         32123
          212
           1
     */

     public static void main(String[] args) {
        int n =4;
        pattern14(n);
     }
     static void pattern14(int n){
        for(int row = 1; row <= (2 * n) - 1; row++){
         
            int spaces = row > n ? row - n : n - row;
            int totalCol = row > n ? n - spaces : row;
 
            for(int s=0; s < spaces; s++){
                System.out.print("  ");
            }
            for(int col = totalCol ; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= totalCol; col++){
                System.out.print( col + " ");
            }
                    System.out.println();
        }

     }
}

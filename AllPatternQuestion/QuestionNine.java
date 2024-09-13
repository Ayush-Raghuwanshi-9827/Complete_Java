public class QuestionNine {
    // Print that pattern with loops
    /*   
        *
       ***
      *****
     *******
    *********
        
     */
    public static void main(String[] args) {
        int n = 5; 
        pattern9(n);
    }
    static void pattern9(int n){
        for(int row =0; row < n; row++){
            int spaces = n - row -1;
            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int col=0; col < (row * 2); col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

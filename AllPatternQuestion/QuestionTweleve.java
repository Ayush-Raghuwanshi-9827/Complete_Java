public class QuestionTweleve {
    // Print this patter using loop
    /*
    
         *
        * *
       *   *
      *     *
     *********

     */
    public static void main(String[] args) {
        int n=5;
    }
    static void patter12(int n){
        for(int row = 0; row < n; row++){
            int OuterSpace = n - row;
            int Innerspace = row;
            for(int s1 = 0; s1 < OuterSpace; s1++){
                System.out.print(" ");
            }
            
        }
    }

}

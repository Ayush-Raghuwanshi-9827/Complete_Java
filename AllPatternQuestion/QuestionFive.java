public class QuestionFive {
    //  Print this pattern by using loops
    /*
       *
       **
       ***
       ****
       *****
       ****
       ***
       **
       *
     */
    public static void main(String[] args) {
        int n = 3;
        pattern5(n);

    }
    static void pattern5(int n){
        for(int row=0; row < 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

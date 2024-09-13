public class QuestionEleven {
    // Print this pattern with loops
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    public static void main(String[] args) {
        int n =5;
        pattern11(n);
    }
    static void pattern11(int n){
        for(int row =0; row < n; row++){
            for(int col =1; col <= row +1; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

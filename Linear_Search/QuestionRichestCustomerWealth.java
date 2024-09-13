// https://leetcode.com/problems/richest-customer-wealth/
public class QuestionRichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {3,2,1},
            {223, 342, 432}
        };

        int ans = checkWealth(arr);
        System.out.println(ans);
    }

    static int checkWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
       for(int i = 0; i < arr.length; i++){
        int max = 0;
           for(int j=0; j < arr[i].length; j++){
            ans += arr[i][j];
           }
           if(max > ans){
            ans = max;
           }
       }
       return ans;
      
       
    }
}

import java.util.Arrays;
// https:///leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class QuestionOnLinearSearch {
    public static void main(String[] args) {
       int[] nums = {12, 345, 2 ,6 ,7896, 2244};
       System.out.println(even(nums));
    }
 static int even(int[] arr){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(num(arr[i])){
                ans++;
            }
        }
        return ans;
    }


    static boolean num(int n){
        int number = digit(n);
        
        return number % 2 == 0;
    }
    
    static int digit(int n){
        int x = 0;
        while(n  > 0){
           x++;
           n = n / 10;
        }
        return x;
    }
}

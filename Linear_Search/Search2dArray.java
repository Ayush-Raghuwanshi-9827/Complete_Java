import java.util.Arrays;

public class Search2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 2, 54, 21},
            {233, 3, 34, 11},
            {1124, 3243, 532, 3},
            {2323, 234, 3}
        };
        findMaximumSum(arr);
        // int target = 3;

        // find(arr, target);
        
        // search(arr, target, true);

        // int maxans = max(arr);
        // int minans = min(arr);
        // System.out.println("Positin of element is : " + Arrays.toString());
        // System.out.println("The minimum value of this Array is: " + minans);
        // System.out.println("The maximum value of this Array is: " + maxans);
    }

    static void search(int[][] arr, int target,boolean findlast){
        int outerIndex = -1;
        int InnerIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for(int j=0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    outerIndex = i;
                    InnerIndex = j;
                    if (findlast == false) {
                    found = true;
                    break;
                }
                }
                
            }
            if (found == true) {
                break;
            }
        }
        System.out.println(outerIndex + "," +InnerIndex);
    }


    // to find the minimum value in 2d array;

    static int min(int[][] arr){
        int min = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                
                if(min > arr[row][col]){
                    min = arr[row][col];
                
                }   
            }
        }
     return min;
    }



    // to find the max element in 2d array;
     static int max(int[][] arr){
        int max = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                
                if(max < arr[row][col]){
                    max = arr[row][col];
                
                }   
            }
        }
     return max;
    }

    // to find all occurence of an target in 2d array
    static void find(int[][] arr, int target){
        int size =0;
        for (int i = 0; i < arr.length; i++) {
            size = size + arr[i].length;
        }
        int ans[][] = new int[size][2];
        int k= 0;

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
              if (arr[i][j] == target) {
                ans[k][0] = i;
                ans[k][1] = j;
                k++; 
              }
            }
        }
        for(int i = 0; i < k; i++) {
            System.out.println(ans[i][0] +"," + ans[i][1]);
        }            
        }
    
    // to find the maximum sum of subarray in 2d array
    
    static void findMaximumSum(int[][] arr){
        int resSum = Integer.MIN_VALUE;
        int resIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length;j++){
             sum = sum + arr[i][j];
            }
            if (sum > resSum) {
                resSum = sum;
                resIndex = i;
               }
            }
            System.out.println("The maximum sum subaaray is " + resSum + ", for index " + resIndex);
        }

    }


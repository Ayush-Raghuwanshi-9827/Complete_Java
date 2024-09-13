package StacksDsaQuestion;

public class MaximumRectangleAreafromMatrix {
    public static void main(String[] args) {
        char[][] arr = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        System.out.println(maximalRectangle(arr));
    }
    public static int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] heights = new int[m];
        int largest = 0;
        for(int i=0; i < n-1; i++){
            for(int j=0; j < m; j++){
                int val = (matrix[i][j] - '0');
                 if(val == 0){
                    heights[j] = 0;
                 }else {
                    heights[j] +=  val;
                 }
            }
            int max = MaximumRectangleRow(heights);
            if (largest < max) {
                largest = max;
            }
        }
        return largest;
    }
    public static int MaximumRectangleRow(int[] heights){
        int n = heights.length;
        int[] stack = new int[n+1];
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<= n; i++){
            int element = (i==n)?0: heights[i];
            while(index != -1 && heights[stack[index]] > element){
                int h = heights[stack[index--]];
                int pv = (index == -1)?-1:stack[index];
                int w = i - pv - 1;
                max = Math.max(max, h*w);
            }
            stack[++index] = i;
        }
        return (max == Integer.MIN_VALUE) ?0:max;
    }
}

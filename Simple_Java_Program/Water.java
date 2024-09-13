public class Water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    static int maxArea(int[] height){
        int maxArea = 0;
        int tempArea = 0;
        for(int i = 0; i < height.length - 1; i++){
          for(int j = 0; j < height.length; j++){
              int length = j - i;
              tempArea = (height[i] * height[j])- length;
          }
          if(tempArea > maxArea){
              maxArea = tempArea; 
          }
        }
        return maxArea;
    }
}

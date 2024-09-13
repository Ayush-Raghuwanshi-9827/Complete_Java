public class SearchMinMax {
    public static void main(String[] args) {
        int[] arr = {12, 23, 424, 1212, 313, 3};
        int ans = min(arr);
        System.out.println("The min Value is : " + ans);
        int ans2  = max(arr);
        System.out.println("The Max element in arr is : " + ans2);
    }
    static int min(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        return min;
        
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
        
    }
}

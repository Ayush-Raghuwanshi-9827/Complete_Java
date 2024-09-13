public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = {222, 3, 4, 2, 33};
        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[] array){
     int maxval = array[0];
     for(int i =1; i < array.length; i++){

     if(maxval < array[i]){
        maxval = array[i];
       }

     }

    return maxval;
    }
    
    
}

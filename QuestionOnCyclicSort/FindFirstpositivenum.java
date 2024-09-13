import java.util.Arrays;

public class FindFirstpositivenum {
    public static void main(String[] args) {
        int[] arr = {1,0, 2,3};
        System.out.println(findfirstpostiveinter(arr));
    }
    static int findfirstpostiveinter(int[] arr){
            int i=0;
            while(i < arr.length){
                int correct = arr[i] -1;
                if(arr[i] > 0 && arr[i] <= arr.length && arr[i] == arr[correct]){
                 swap(arr, i, correct);
            }else {
                i++;
            }

            for(int index =0; index < arr.length; index++){
                if(index+1 != arr[index]){
                    return index +1;
                }
            } 
            
        }   
        return arr.length +1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

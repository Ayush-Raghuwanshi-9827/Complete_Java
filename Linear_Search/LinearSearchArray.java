public class LinearSearchArray{
    public static void main(String[] args) {
        int[] arr = { 22, 32, 123, 4421, 12124, 42241, 2141};
        int ans = check2(arr, 123);
        System.out.println(ans);
    }
// function that check the target index in Array;
    static int check(int[] array,int target){
        if(array.length == 0){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if(target == array[i]){
                int elment = array[i];
                return elment;
            }

        }
        return Integer.MAX_VALUE;

    }


// check2 for return the index of array element.S

   static int check2(int[] array,int target){
        if(array.length == 0){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if(target == array[i]){
                
                return i;
            }

        }
        return -1;

    }
}
public class ReverseAnArray {
    
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i=0; i < 8; i++) {
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int n =arr.length;
        int l = n;
        for(int i=0; i < n /2; i++){
            swap(arr, i, --l);
        }
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
      
    }

    public static void swap(int[] arr,int fi, int li){
        int temp = arr[li];
        arr[li] = arr[fi];
        arr[fi] = temp;
    }
}

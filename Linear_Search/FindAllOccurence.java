public class FindAllOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2 ,3 ,4, 2, 5};
        System.out.println("This is the last occurrence : " + find(arr, 2));
    }
    static int find(int[] arr, int target){
        // This new array is used to insert the index of taget elemts
        int[] ans = new int[arr.length];
        int counter = 0;
        // if their is no any element in array
        if(arr.length < 0){
           return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                ans[counter] = i;
                counter++;
            }
        }
        // for (int i = 0; i < counter; i++) {
        //     System.out.print(ans[i] + " ");
        // }
        // this is used for last occurence of element in array
        return ans[counter - 1];

        
    }
}

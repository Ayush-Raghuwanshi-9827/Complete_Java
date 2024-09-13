public class SearchCharInRange {
    public static void main(String[] args) {
        int[] name1 = {12, 32, 432, 32, 23, 112, 432};
        char target = 432;
        int ans = search(name1, target, 4, 5);
        System.out.println(ans);

        
    }
    static int search(int[] str1, int target, int start, int end){
        if(str1.length == 0){
            return -1;
        }

        for(int i = start; i <= end; i++){
            int element = str1[i];
            if(element == target){
                return i;
            }
        }
        return -1;
        
    }
}

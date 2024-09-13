import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] nums = {0, 1, 7, 4, 4, 5};
        System.out.println(sample(nums, 3, 6));
    }
    static long sample(int[] nums,int lower,int upper){
        Arrays.sort(nums);
        int n = nums.length;
        long result = 0;
        for(int i = 0; i < n-1; i++){
            long lowSum = lower - nums[i];
            long highSum = upper - nums[i];
            int count1 = lowerBound(i+1, n, nums, lowSum);
            int count2 = upperBound(i+1, n, nums, highSum);
            result += (count2 - count1);
        }
        return result;
    }
        static int lowerBound(int start, int end, int[] nums, long key){
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    
    static int upperBound(int start, int end, int[] nums, long key){
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] <= key){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    

}

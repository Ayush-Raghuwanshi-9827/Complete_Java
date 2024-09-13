import java.util.ArrayList;

public class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>();

        Arr.add(400);
        Arr.add(200);
        Arr.add(300);
        Arr.add(100);
        
        long ans = maximumSumSubarray(1, Arr, Arr.size());
        System.out.println(Arr.size());
        System.out.println(ans);
    }
    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long sum = 0;
        long MaxSum = 0;
        for(int i=0; i < K; i++){
            MaxSum += Arr.get(i);
        }
        sum = MaxSum;
        for(int i = 1; i < N-K+1; i++){
            sum = sum - Arr.get(i - 1);
            sum += Arr.get(i+K-1);

            MaxSum = Math.max(sum, MaxSum);
            
        }
        
        return MaxSum;
    }
}
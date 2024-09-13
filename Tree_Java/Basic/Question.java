package Basic;

public class Question {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int res = ans(arr);
        System.out.println(res);
    }
    public static int ans(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;

        // Iterate through the prices array to find the maximum profit
        for (int currentPrice : prices) {
            // Update the minimum price if a new minimum is encountered
            minPrice = Math.min(minPrice, currentPrice);
            // Update the maximum profit if a new maximum is encountered
            maxProfit = Math.max(maxProfit, currentPrice - minPrice);
        }

        // Return the maximum profit achieved
        return maxProfit;
    }

}



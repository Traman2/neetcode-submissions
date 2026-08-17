class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;

        int max = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                max = Math.max(profit, max);
            } 
            else left = right;
            right++;
        }

        return max;
    }
}

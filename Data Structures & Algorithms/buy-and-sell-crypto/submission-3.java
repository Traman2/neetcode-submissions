class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;

        int max = 0;

        for(int i = 0; i < prices.length - 1; i++){
            if(prices[left] < prices[right]){
                max = Math.max(max, prices[right] - prices[left]);
                
            }
            else left = right;
            right++;
        }

        return max;
    }
}

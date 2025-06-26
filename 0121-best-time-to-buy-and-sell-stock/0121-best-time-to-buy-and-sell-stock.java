class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int min = prices[0];
        int profit = 0;
        int maxprofit = 0;

        for (int i=1; i<n; i++){
            if (prices[i]<min){
                min = prices[i];
            }

            else{
                profit = prices[i] - min;
                if (profit > maxprofit){
                    maxprofit = profit;
                }
            }
        }

        return maxprofit;
    }
}

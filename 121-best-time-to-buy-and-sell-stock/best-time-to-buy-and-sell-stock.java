class Solution {
    public int maxProfit(int[] prices) {
        //approach 1 - brut force method

        //approach 2
        //maintain lowprice(min value)
        int lowBuyPrice = Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i]<lowBuyPrice)
            {
                lowBuyPrice = prices[i];
            }
            int profit = prices[i]- lowBuyPrice;
            if(profit>maxprofit)
            {
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
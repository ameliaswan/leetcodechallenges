package dataStructures.greedy;


//    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimetoBuyandSellStock_121 {
    public int maxProfit(int[] prices) {
        int lowest = 10000;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lowest){
                lowest = prices[i];
            }

            if(prices[i] - lowest > maxProfit){
                maxProfit = prices[i] - lowest;
            }
        }
        return maxProfit;
    }
}

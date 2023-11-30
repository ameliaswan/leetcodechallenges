package dataStructures.greedy;

//@author Kooni Wang 1322454
public class BestTimetoBuyandSellStock {

    public int bestProfit(int[] input){
        int l = 0, r = 1, maxProfit = 0;
        while(r < input.length){
            if(input[r] > input[l]){
                maxProfit = Math.max(maxProfit, input[r] - input[l]);
            }else{
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] input = {7,1,5,3,6,4};
        BestTimetoBuyandSellStock var = new BestTimetoBuyandSellStock();
        System.out.println("Kooni Wang 1322454");
        System.out.println("The best profit is: " + var.bestProfit(input));
    }
}

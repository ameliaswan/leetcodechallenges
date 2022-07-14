package dataStructures.greedy;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_BestTimetoBuyandSellStock_121 {

    @Test
    void hasMaxProfit(){
        int[] prices = {7,1,5,3,6,4};
        int output = 5;

        BestTimetoBuyandSellStock_121 var = new BestTimetoBuyandSellStock_121();
        int expect = var.maxProfit(prices);

        Assertions.assertEquals(output, expect);
    }

    @Test
    void hasNoMaxProfit(){
        int[] prices = {7,6,4,3,1};
        int output = 0;

        BestTimetoBuyandSellStock_121 var = new BestTimetoBuyandSellStock_121();
        int expect = var.maxProfit(prices);

        Assertions.assertEquals(output, expect);
    }

    @Test
    void hasOnlyOneElement(){
        int[] prices = {7};
        int output = 0;

        BestTimetoBuyandSellStock_121 var = new BestTimetoBuyandSellStock_121();
        int expect = var.maxProfit(prices);

        Assertions.assertEquals(output, expect);
    }
}

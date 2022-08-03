package dataStructures.dynamicProgramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_MinCostClimbingStairs_746 {
    @Test
    void testCase1(){
        int[] cost = {10,15,20};
        int result = 15;

        MinCostClimbingStairs_746 var = new MinCostClimbingStairs_746();
        int expect = var.minCostClimbingStairs(cost);

        Assertions.assertEquals(result, expect);
    }


    @Test
    void testCase2(){
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int result = 6;

        MinCostClimbingStairs_746 var = new MinCostClimbingStairs_746();
        int expect = var.minCostClimbingStairs(cost);

        Assertions.assertEquals(result, expect);
    }
}

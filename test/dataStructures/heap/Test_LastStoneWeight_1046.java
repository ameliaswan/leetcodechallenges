package dataStructures.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_LastStoneWeight_1046 {

    @Test
    void testCase1(){
        int[] stones = {2,7,4,1,8,1};
        int result = 1;

        LastStoneWeight_1046 var = new LastStoneWeight_1046();
        int expect = var.lastStoneWeight(stones);
        int expect2 = var.lastStoneWeight2(stones);

        Assertions.assertEquals(result, expect);
        Assertions.assertEquals(result, expect2);
    }

    @Test
    void testCase2(){
        int[] stones = {1};
        int result = 1;

        LastStoneWeight_1046 var = new LastStoneWeight_1046();
        int expect = var.lastStoneWeight(stones);
        int expect2 = var.lastStoneWeight2(stones);

        Assertions.assertEquals(result, expect);
        Assertions.assertEquals(result, expect2);
    }
}

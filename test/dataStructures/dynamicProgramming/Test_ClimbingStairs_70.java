package dataStructures.dynamicProgramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_ClimbingStairs_70 {
    @Test
    void testCase1(){
        int n = 3;
        int result = 3;

        ClimbingStairs_70 var = new ClimbingStairs_70();
        int expect = var.climbStairs(n);

        Assertions.assertEquals(result, expect);
    }
}

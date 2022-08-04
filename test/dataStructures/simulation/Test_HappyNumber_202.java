package dataStructures.simulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_HappyNumber_202 {
    @Test
    void testCaseHappyTrue(){
        int n = 19;
        boolean result = true;

        HappyNumber_202 var = new HappyNumber_202();
        boolean expect = var.isHappy(n);

        Assertions.assertEquals(result, expect);
    }

    @Test
    void testCaseHappyFalse(){
        int n = 2;
        boolean result = false;

        HappyNumber_202 var = new HappyNumber_202();
        boolean expect = var.isHappy(n);

        Assertions.assertEquals(result, expect);
    }
}

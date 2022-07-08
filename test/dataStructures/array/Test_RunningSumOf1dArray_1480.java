package dataStructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_RunningSumOf1dArray_1480 {

    @Test
    public void testRandomElements(){
        int[] arrOri = {1, 3, 4, 2};
        int[] arrSum = {1, 4, 8, 10};
        RunningSumOf1dArray_1480 var = new RunningSumOf1dArray_1480();
        Assertions.assertArrayEquals(var.runningSum(arrOri), arrSum);
    }
}

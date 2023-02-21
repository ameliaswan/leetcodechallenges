package dataStructures.pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pointers.Closest3Sum_16;

public class Test_Closest3Sum_16 {
    @Test
    void testCase1(){
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int expected = 2;

        Closest3Sum_16 var = new Closest3Sum_16();
        int result = var.threeSumClosest(nums, target);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testCase2(){
        int[] nums = {0,0,0};
        int target = 1;
        int expected = 0;

        Closest3Sum_16 var = new Closest3Sum_16();
        int result = var.threeSumClosest(nums, target);

        Assertions.assertEquals(expected, result);
    }
}

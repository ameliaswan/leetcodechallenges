package dataStructures.hashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_TwoSum_1 {
    @Test
    void testCase1(){
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = {0,1};

        TwoSum_1 var = new TwoSum_1();
        int[] expect = var.twoSum(nums, target);

        Assertions.assertArrayEquals(result, expect);
    }
}

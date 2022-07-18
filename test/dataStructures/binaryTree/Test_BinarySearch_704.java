package dataStructures.binaryTree;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_BinarySearch_704 {

    @Test
    void testCase1(){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = 4;

        BinarySearch_704 var = new BinarySearch_704();
        int expect = var.search(nums, target);

        Assertions.assertEquals(result, expect);
    }
}

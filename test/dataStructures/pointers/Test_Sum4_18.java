package dataStructures.pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_Sum4_18 {
    @Test
    void testCase1(){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2,-1,1,2), Arrays.asList(-2,0,0,2), Arrays.asList(-1,0,0,1));

        Sum4_18 var = new Sum4_18();
        List<List<Integer>> result = var.fourSum(nums, target);

        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void testCase2(){
        int[] nums = {2,2,2,2,2};
        int target = 8;
        List<List<Integer>> expected = List.of(Arrays.asList(2, 2, 2, 2));

        Sum4_18 var = new Sum4_18();
        List<List<Integer>> result = var.fourSum(nums, target);

        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void testCase3(){
        int[] nums = {-2,-1,-1,1,1,2,2};
        int target = 0;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2,-1,1,2), Arrays.asList(-1,-1,1,1));

        Sum4_18 var = new Sum4_18();
        List<List<Integer>> result = var.fourSum(nums, target);

        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void testCase4(){
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        List<List<Integer>> expected = new ArrayList<>();

        Sum4_18 var = new Sum4_18();
        List<List<Integer>> result = var.fourSum(nums, target);

        Assertions.assertIterableEquals(expected, result);
    }
}

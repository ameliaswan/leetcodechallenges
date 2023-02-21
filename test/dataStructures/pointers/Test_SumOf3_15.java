package dataStructures.pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pointers.SumOf3_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_SumOf3_15 {
    @Test
    void TestCase1(){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1));

        SumOf3_15 var = new SumOf3_15();
        List<List<Integer>> result = var.threeSum(nums);

        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void TestCase2(){
        int[] nums = {0,1,1};
        List<List<Integer>> expected = new ArrayList<>();

        SumOf3_15 var = new SumOf3_15();
        List<List<Integer>> result = var.threeSum(nums);

        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void TestCase3(){
        int[] nums = {0,0,0};
        List<List<Integer>> expected = List.of(Arrays.asList(0,0,0));

        SumOf3_15 var = new SumOf3_15();
        List<List<Integer>> result = var.threeSum(nums);

        Assertions.assertIterableEquals(expected, result);
    }
}

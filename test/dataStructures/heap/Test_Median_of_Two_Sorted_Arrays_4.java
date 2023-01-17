package dataStructures.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Median_of_Two_Sorted_Arrays_4 {

    @Test
    void TestCase1(){
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected = 2.0;

        Median_of_Two_Sorted_Arrays_4 var = new Median_of_Two_Sorted_Arrays_4();
        double result = var.findMedianSortedArrays(nums1, nums2);

        Assertions.assertEquals(expected, result);
    }


    @Test
    void TestCase2(){
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;

        Median_of_Two_Sorted_Arrays_4 var = new Median_of_Two_Sorted_Arrays_4();
        double result = var.findMedianSortedArrays(nums1, nums2);

        Assertions.assertEquals(expected, result);
    }
}

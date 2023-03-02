package dataStructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_RemoveDuplicatesfromSortedArray_26 {
    @Test
    void testCaseNoDuplicate(){
        int[] nums = {1,2,3,4,5};
        int[] expectedNum = {1,2,3,4,5};

        RemoveDuplicatesfromSortedArray_26 var = new RemoveDuplicatesfromSortedArray_26();
        int result = var.removeDuplicates(nums);

        Assertions.assertTrue(arraysEqualforFixedLen(expectedNum, nums, result));

    }

    @Test
    void testCaseAllDuplicates(){
        int[] nums = {1,1,1,1,1,1};
        int[] expectedNum = {1};

        RemoveDuplicatesfromSortedArray_26 var = new RemoveDuplicatesfromSortedArray_26();
        int result = var.removeDuplicates(nums);

        Assertions.assertTrue(arraysEqualforFixedLen(expectedNum, nums, result));
    }

    @Test
    void testCaseSomeDuplicates(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNum = {0,1,2,3,4};

        RemoveDuplicatesfromSortedArray_26 var = new RemoveDuplicatesfromSortedArray_26();
        int result = var.removeDuplicates(nums);

        Assertions.assertTrue(arraysEqualforFixedLen(expectedNum, nums, result));
    }

    boolean arraysEqualforFixedLen(int[] arr1, int[] arr2, int len){
        boolean result = true;
        for(int i = 0; i < len; i++)
            if(arr1[i] != arr2[i]) return false;
        return result;
    }
}

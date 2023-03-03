package dataStructures.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_SearchInsertPosition_35 {
    @Test
    void testCaseTargetCanbeFound(){
        int[] nums = {1,3,5,6};
        int target = 5;
        int expected = 2;

        SearchInsertPosition_35 var = new SearchInsertPosition_35();
        int result = var.searchInsert(nums, target);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testCaseTargetCannotbeFound(){
        int[] nums = {1,3,5,6};
        int target = 2;
        int expected = 1;

        SearchInsertPosition_35 var = new SearchInsertPosition_35();
        int result = var.searchInsert(nums, target);

        Assertions.assertEquals(expected, result);
    }
}

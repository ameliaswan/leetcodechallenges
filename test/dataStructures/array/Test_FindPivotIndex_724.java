package dataStructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_FindPivotIndex_724 {

    @Test
    public void testArrayWithRandomInt(){
        int[] arr = {3, 2, 2, 6, 7};
        int pivot = 3;
        FindPivotIndex_724 var = new FindPivotIndex_724();
        Assertions.assertEquals(var.pivotIndex(arr), pivot);
    }
}

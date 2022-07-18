package dataStructures.binaryTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_FirstBadVersion_278 {
    @Test
    void testCase1(){
        int[] versions = {1,1,1,0,0};
        int len = 5,  result = 4;

        FirstBadVersion_278 var = new FirstBadVersion_278();
        var.versions = versions;
        int expect = var.firstBadVersion(len);

        Assertions.assertEquals(result, expect);
    }
}

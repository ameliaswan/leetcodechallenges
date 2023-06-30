package dataStructures.dynamicProgramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test_MinimumFallingPathSum_931 {

    MinimumFallingPathSum_931 var = new MinimumFallingPathSum_931();

    @Test
    @DisplayName("3*3 matrix")
    void testCaseThreebyThree(){
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        Assertions.assertEquals(13, var.minFallingPathSum(matrix));
    }

    @Test
    @DisplayName("2*2 matrix")
    void testCaseTwobyTwo(){
        int[][] matrix = {{-19,57},{-40,-5}};
        Assertions.assertEquals(-59, var.minFallingPathSum(matrix));
    }
}

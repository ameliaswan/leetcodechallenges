package dataStructures.dynamicProgramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test_MaximalSquare_221 {

    MaximalSquare_221 var = new MaximalSquare_221();
    @Test
    @DisplayName("4*5 matrix")
    public void fourByFiveMatrix(){
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        Assertions.assertEquals(4, var.maximalSquare(matrix));
    }


    @Test
    @DisplayName("5*5 matrix")
    public void fiveByFiveMatrix(){
        char[][] matrix = {{'1','1','1','1','0'},{'1','1','1','1','0'},{'1','1','1','1','1'},{'1','1','1','1','1'},{'0','0','1','1','1'}};
        Assertions.assertEquals(16, var.maximalSquare(matrix));
    }

    @Test
    @DisplayName("matrix without 1")
    public void allZeroMatrix(){
        char[][] matrix = {{'0','0'},{'0','0'}};
        Assertions.assertEquals(0, var.maximalSquare(matrix));
    }
}

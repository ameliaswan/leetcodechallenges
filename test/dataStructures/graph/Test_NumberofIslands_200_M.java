package dataStructures.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_NumberofIslands_200_M {
    @Test
    void testCase1(){
        char[][] image = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        int result = 1;

        NumberofIslands_200_M var = new NumberofIslands_200_M();
        int expect = var.numIslands(image);

        Assertions.assertEquals(result, expect);
    }


    @Test
    void testCase2(){
        char[][] image = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        int result = 3;

        NumberofIslands_200_M var = new NumberofIslands_200_M();
        int expect = var.numIslands(image);

        Assertions.assertEquals(result, expect);
    }
}

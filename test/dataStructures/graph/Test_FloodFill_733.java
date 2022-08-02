package dataStructures.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_FloodFill_733 {
    @Test
    void testCase1(){
        int[][] image = {{1,1,1}, {1,1,0}, {1,0,1}};
        int sr = 1, sc = 1, color = 2;
        int[][] result = {{2,2,2},{2,2,0},{2,0,1}};

        FloodFill_733 var = new FloodFill_733();
        int[][] expect = var.floodFill(image, sr, sc, color);

        Assertions.assertArrayEquals(result, expect);
    }


    @Test
    void testCase2(){
        int[][] image = {{0,0,0}, {0,0,0}, {0,0,0}};
        int sr = 0, sc = 0, color = 0;
        int[][] result = {{0,0,0},{0,0,0},{0,0,0}};

        FloodFill_733 var = new FloodFill_733();
        int[][] expect = var.floodFill(image, sr, sc, color);

        Assertions.assertArrayEquals(result, expect);
    }

    @Test
    void testCase3(){
        int[][] image = {{0,0,0}, {0,1,1}};
        int sr = 1, sc = 1, color = 1;
        int[][] result = {{0,0,0}, {0,1,1}};

        FloodFill_733 var = new FloodFill_733();
        int[][] expect = var.floodFill(image, sr, sc, color);

        Assertions.assertArrayEquals(result, expect);
    }
}

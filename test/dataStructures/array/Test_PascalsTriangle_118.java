package dataStructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class Test_PascalsTriangle_118 {
    @Test
    void testCaseOnlyOneElement(){
        int numRows = 1;
        List<List<Integer>> expected = List.of(List.of(1));

        PascalsTriangle_118 var = new PascalsTriangle_118();
        List<List<Integer>> result = var.generate(numRows);

        Assertions.assertTrue(expected.toString().equals(result.toString()));


    }

    @Test
    void testCaseMultipleElements(){
        int numRows = 5;
        List<List<Integer>> expected = List.of(List.of(1), Arrays.asList(1,1), Arrays.asList(1,2,1), Arrays.asList(1,3,3,1), Arrays.asList(1,4,6,4,1));

        PascalsTriangle_118 var = new PascalsTriangle_118();
        List<List<Integer>> result = var.generate(numRows);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }
}

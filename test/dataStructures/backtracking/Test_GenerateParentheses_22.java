package dataStructures.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Test_GenerateParentheses_22 {
    @Test
    void testCase1(){
        int n = 3;
        List<String> expected = Arrays.asList("((()))","(()())","(())()","()(())","()()()");

        GenerateParentheses_22 var = new GenerateParentheses_22();
        List<String> result = var.generateParenthesis(n);

        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void testCase2(){
        int n = 1;
        List<String> expected = List.of("()");

        GenerateParentheses_22 var = new GenerateParentheses_22();
        List<String> result = var.generateParenthesis(n);

        Assertions.assertIterableEquals(expected, result);
    }
}

package dataStructures.dynamicProgramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_FibonacciNumber_509 {
    @Test
    void testCase1(){
        int n = 4;
        int result = 3;

        FibonacciNumber_509 var = new FibonacciNumber_509();
        int expect = var.fib(n);

        Assertions.assertEquals(result, expect);
    }
}

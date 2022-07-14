package dataStructures.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_LongestPalindrome_409 {
    @Test
    void hasMaxPalinLen(){
        String s = "abccccdd";
        int output = 7;

        String s2 = "ccc";
        int output2 = 3;

        String s3 = "cc";
        int output3 = 2;

        LongestPalindrome_409 var = new LongestPalindrome_409();
        int expect = var.longestPalindrome(s);
        int expect2 = var.longestPalindrome(s2);
        int expect3 = var.longestPalindrome(s3);

        Assertions.assertEquals(output, expect);
        Assertions.assertEquals(output2, expect2);
        Assertions.assertEquals(output3, expect3);
    }

    @Test
    void hasNoPalin(){
        String s = "abc";
        int output = 1;

        LongestPalindrome_409 var = new LongestPalindrome_409();
        int expect = var.longestPalindrome(s);

        Assertions.assertEquals(output, expect);
    }
}

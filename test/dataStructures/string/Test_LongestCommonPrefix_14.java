package dataStructures.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_LongestCommonPrefix_14 {
    @Test
    public void testCase1(){
        String[] strs = {"flower","flow","flight"};
        LongestCommonPrefix_14 var = new LongestCommonPrefix_14();
        String result = var.longestCommonPrefix(strs);
        String expected = "fl";

        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testCase2(){
        String[] strs = {"dog","racecar","car"};
        LongestCommonPrefix_14 var = new LongestCommonPrefix_14();
        String result = var.longestCommonPrefix(strs);
        String expected = "";

        Assertions.assertEquals(result, expected);
    }

}

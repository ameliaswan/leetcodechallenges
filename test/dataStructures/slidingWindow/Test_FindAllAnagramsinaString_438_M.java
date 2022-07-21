package dataStructures.slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Test_FindAllAnagramsinaString_438_M {
    @Test
    void testCase1(){
        String s = "cbaebabacd", p = "abc";
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(6);

        FindAllAnagramsinaString_438_M var = new FindAllAnagramsinaString_438_M();
        List<Integer> expect1 = var.findAnagrams(s, p);
        List<Integer> expect2 = var.findAnagrams(s, p);

        Assertions.assertIterableEquals(result, expect1);
        Assertions.assertIterableEquals(result, expect2);
    }



    @Test
    void testCase2(){
        String s = "abab", p = "ab";
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        result.add(2);

        FindAllAnagramsinaString_438_M var = new FindAllAnagramsinaString_438_M();
        List<Integer> expect1 = var.findAnagrams(s, p);
        List<Integer> expect2 = var.findAnagrams(s, p);

        Assertions.assertIterableEquals(result, expect1);
        Assertions.assertIterableEquals(result, expect2);
    }



    @Test
    void testCase3(){
        String s = "aaaaaaaaaa", p = "aaaaaaaaaaaaa";
        List<Integer> result = new ArrayList<>();

        FindAllAnagramsinaString_438_M var = new FindAllAnagramsinaString_438_M();
        List<Integer> expect1 = var.findAnagrams(s, p);
        List<Integer> expect2 = var.findAnagrams(s, p);

        Assertions.assertIterableEquals(result, expect1);
        Assertions.assertIterableEquals(result, expect2);
    }
}

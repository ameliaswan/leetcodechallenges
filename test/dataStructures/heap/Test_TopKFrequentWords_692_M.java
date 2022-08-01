package dataStructures.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Test_TopKFrequentWords_692_M {

    @Test
    void testCase1(){
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        List<String> result = Arrays.asList("the", "is", "sunny", "day");

        TopKFrequentWords_692_M var = new TopKFrequentWords_692_M();
        List<String> expect = var.topKFrequent(words, k);

        Assertions.assertArrayEquals(result.toArray(), expect.toArray());
    }

    @Test
    void testCase2(){
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        List<String> result = Arrays.asList("i","love");

        TopKFrequentWords_692_M var = new TopKFrequentWords_692_M();
        List<String> expect = var.topKFrequent(words, k);

        Assertions.assertArrayEquals(result.toArray(), expect.toArray());
    }

    @Test
    void testCase3(){
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 1;
        List<String> result = Arrays.asList("i");

        TopKFrequentWords_692_M var = new TopKFrequentWords_692_M();
        List<String> expect = var.topKFrequent(words, k);

        Assertions.assertArrayEquals(result.toArray(), expect.toArray());
    }
}

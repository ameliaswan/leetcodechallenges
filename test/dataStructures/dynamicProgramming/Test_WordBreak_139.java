package dataStructures.dynamicProgramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Test_WordBreak_139 {

    WordBreak_139 var = new WordBreak_139();

    @Test
    public void dictContainsOriginalStr(){
        List<String> dict = List.of("leetcode");
        String s = "leetcode";

        Assertions.assertTrue(var.wordBreak(s, dict));

    }
}

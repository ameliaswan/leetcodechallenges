package dataStructures.slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_LongestRepeatingCharacterReplacement_424_M {

    @Test
    void testCase1(){
        String s = "AABABBBBA";
        int k = 2;
        int result = 7;

        LongestRepeatingCharacterReplacement_424_M var = new LongestRepeatingCharacterReplacement_424_M();
        int expect = var.characterReplacement(s, k);

        Assertions.assertEquals(result, expect);
    }


    @Test
    void testCase2(){
        String s = "ABBB";
        int k = 2;
        int result = 4;

        LongestRepeatingCharacterReplacement_424_M var = new LongestRepeatingCharacterReplacement_424_M();
        int expect = var.characterReplacement(s, k);

        Assertions.assertEquals(result, expect);
    }
}

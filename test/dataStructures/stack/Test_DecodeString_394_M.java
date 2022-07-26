package dataStructures.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_DecodeString_394_M {

    @Test
    void testCase1(){
        String s = "3[a]2[bc]";
        String result = "aaabcbc";

        String s2 = "3[a2[c]]";
        String result2 = "accaccacc";

        String s3 = "2[abc]3[cd]ef";
        String result3 = "abcabccdcdcdef";

        DecodeString_394_M var = new DecodeString_394_M();
        String expect = var.decodeString(s);
        String expect2 = var.decodeString(s2);
        String expect3 = var.decodeString(s3);

        Assertions.assertEquals(result, expect);
        Assertions.assertEquals(result2, expect2);
        Assertions.assertEquals(result3, expect3);
    }
}

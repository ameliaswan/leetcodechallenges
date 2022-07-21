package dataStructures.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_BackspaceStringCompare_844 {

    @Test
    void testCase1(){
        String s = "ab#c", t = "ad#c";
        boolean result = true;

        BackspaceStringCompare_844 var = new BackspaceStringCompare_844();
        boolean expect = var.backspaceCompare(s, t);

        Assertions.assertEquals(result, expect);
    }


    @Test
    void testCase2(){
        String s = "ab##", t = "c#d#";
        boolean result = true;

        BackspaceStringCompare_844 var = new BackspaceStringCompare_844();
        boolean expect = var.backspaceCompare(s, t);

        Assertions.assertEquals(result, expect);
    }

    @Test
    void testCase3(){
        String s = "a#c", t = "b";
        boolean result = false;

        BackspaceStringCompare_844 var = new BackspaceStringCompare_844();
        boolean expect = var.backspaceCompare(s, t);

        Assertions.assertEquals(result, expect);
    }

    @Test
    void testCase4(){
        String s = "####a#c", t = "##a#####c";
        boolean result = true;

        BackspaceStringCompare_844 var = new BackspaceStringCompare_844();
        boolean expect = var.backspaceCompare(s, t);

        Assertions.assertEquals(result, expect);
    }
}

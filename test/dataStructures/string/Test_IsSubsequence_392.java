package dataStructures.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_IsSubsequence_392 {

    @Test
    public void isSubsequenceTrueCase(){
        String s = "abc";
        String t = "ahbgdc";
        IsSubsequence_392 var = new IsSubsequence_392();
        Assertions.assertTrue(var.isSubsequence(s, t));
    }

    @Test
    public void isSubsequenceFalseCase(){
        String s = "axc";
        String t = "ahbgdc";
        IsSubsequence_392 var = new IsSubsequence_392();
        Assertions.assertFalse(var.isSubsequence(s, t));
    }

    @Test
    public void isSubsequenceFalseCase2(){
        String s = "acb";
        String t = "ahbgdc";
        IsSubsequence_392 var = new IsSubsequence_392();
        Assertions.assertFalse(var.isSubsequence(s, t));
    }

    @Test
    public void rangeCheck(){
        String s = "";
        String t = "ahbgdc";
        IsSubsequence_392 var = new IsSubsequence_392();
        Assertions.assertFalse(var.isSubsequence(s, t));
    }
}

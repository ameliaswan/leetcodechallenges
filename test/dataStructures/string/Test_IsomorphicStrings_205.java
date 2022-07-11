package dataStructures.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_IsomorphicStrings_205 {

    @Test
    public void trueCase(){
        String s = "egg";
        String t = "add";

        IsomorphicStrings_205 var = new IsomorphicStrings_205();
        Assertions.assertTrue(var.isIsomorphic(s, t));
        Assertions.assertTrue(var.isIsomorphic2(s, t));
    }

    @Test
    public void trueCase2(){
        String s = "paper";
        String t = "title";

        IsomorphicStrings_205 var = new IsomorphicStrings_205();
        Assertions.assertTrue(var.isIsomorphic(s, t));
        Assertions.assertTrue(var.isIsomorphic2(s, t));
    }

    @Test
    public void falseCase2(){
        String s = "foo";
        String t = "bar";

        IsomorphicStrings_205 var = new IsomorphicStrings_205();
        Assertions.assertFalse(var.isIsomorphic(s, t));
        Assertions.assertFalse(var.isIsomorphic2(s, t));
    }
}

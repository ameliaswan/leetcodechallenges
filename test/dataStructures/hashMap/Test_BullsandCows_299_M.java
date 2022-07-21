package dataStructures.hashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_BullsandCows_299_M {

    @Test
    void testCase1(){
        String secret = "1807", guess = "7810";
        String result = "1A3B";

        BullsandCows_299_M var = new BullsandCows_299_M();
        String expect = var.getHint(secret, guess);
        String expect2 = var.getHint2(secret, guess);

        Assertions.assertEquals(result, expect);
        Assertions.assertEquals(result, expect2);
    }


    @Test
    void testCase2(){
        String secret = "1123", guess = "0111";
        String result = "1A1B";

        BullsandCows_299_M var = new BullsandCows_299_M();
        String expect = var.getHint(secret, guess);
        String expect2 = var.getHint2(secret, guess);

        Assertions.assertEquals(result, expect);
        Assertions.assertEquals(result, expect2);
    }


    @Test
    void testCase3(){
        String secret = "11", guess = "10";
        String result = "1A0B";

        BullsandCows_299_M var = new BullsandCows_299_M();
        String expect = var.getHint(secret, guess);
        String expect2 = var.getHint2(secret, guess);

        Assertions.assertEquals(result, expect);
        Assertions.assertEquals(result, expect2);
    }
}

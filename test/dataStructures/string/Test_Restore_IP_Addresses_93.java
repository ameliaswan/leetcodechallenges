package dataStructures.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_Restore_IP_Addresses_93 {
    @Test
    void TestCase1(){
        String s = "25525511135";
        List<String> expect = Arrays.asList("255.255.11.135","255.255.111.35");

        Restore_IP_Addresses_93 var = new Restore_IP_Addresses_93();
        List<String> result = var.restoreIpAddresses(s);

        Assertions.assertArrayEquals(expect.toArray(), result.toArray());
    }


    @Test
    void TestCase2(){
        String s = "0000";
        List<String> expect = Arrays.asList("0.0.0.0");

        Restore_IP_Addresses_93 var = new Restore_IP_Addresses_93();
        List<String> result = var.restoreIpAddresses(s);

        Assertions.assertArrayEquals(expect.toArray(), result.toArray());
    }


    @Test
    void TestCase3(){
        String s = "101023";
        List<String> expect = Arrays.asList("1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3");

        Restore_IP_Addresses_93 var = new Restore_IP_Addresses_93();
        List<String> result = var.restoreIpAddresses(s);

        Assertions.assertArrayEquals(expect.toArray(), result.toArray());
    }


    @Test
    void TestCase4(){
        String s = "123";
        List<String> expect = new ArrayList<>();

        Restore_IP_Addresses_93 var = new Restore_IP_Addresses_93();
        List<String> result = var.restoreIpAddresses(s);

        Assertions.assertArrayEquals(expect.toArray(), result.toArray());
    }
}

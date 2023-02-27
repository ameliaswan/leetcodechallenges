package dataStructures.recursion;

import dataStructures.utilClasses.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_ReverseNodesinkGroup_25 {
    @Test
    void testCaseLengthBiggerThanInput(){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 3;
        ListNode expected = new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(5)))));

        ReverseNodesinkGroup_25 var = new ReverseNodesinkGroup_25();
        ListNode result = var.reverseKGroup(head, k);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }

    @Test
    void testCaseLengthEqualstoInput(){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 5;
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));

        ReverseNodesinkGroup_25 var = new ReverseNodesinkGroup_25();
        ListNode result = var.reverseKGroup(head, k);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }
}

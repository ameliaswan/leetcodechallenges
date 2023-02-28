package dataStructures.linkedList;

import dataStructures.utilClasses.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_SwappingNodesinaLinkedList_1721 {
    @Test
    void testCaseKequalsOne(){
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        int k = 1;
        ListNode expected = new ListNode(5,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(1)))));

        SwappingNodesinaLinkedList_1721 var = new SwappingNodesinaLinkedList_1721();
        ListNode result = var.swapNodes(head, k);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }

    @Test
    void testCaseKequalsLength(){
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        int k = 5;
        ListNode expected = new ListNode(5,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(1)))));

        SwappingNodesinaLinkedList_1721 var = new SwappingNodesinaLinkedList_1721();
        ListNode result = var.swapNodes(head, k);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }

    @Test
    void testCaseKBiggerThanOneAndSmallerThanLength(){
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        int k = 2;
        ListNode expected = new ListNode(1,new ListNode(4,new ListNode(3,new ListNode(2,new ListNode(5)))));

        SwappingNodesinaLinkedList_1721 var = new SwappingNodesinaLinkedList_1721();
        ListNode result = var.swapNodes(head, k);

        Assertions.assertTrue(expected.toString().equals(result.toString()));
    }
}

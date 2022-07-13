package dataStructures.linkedList;



import dataStructures.utilClasses.ListNode;
import dataStructures.utils.CompareElements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class Test_MiddleoftheLinkedList_876 {
    @Test
    void testCase1(){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = new ListNode(3, new ListNode(4, new ListNode(5)));

        MiddleoftheLinkedList_876 var = new MiddleoftheLinkedList_876();
        ListNode expected = var.middleNode(head);
        Assertions.assertTrue(CompareElements.compareListNodeElements(result, expected));
    }

    @Test
    void testCase2(){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4))));
        ListNode result = new ListNode(2, new ListNode(4));

        MiddleoftheLinkedList_876 var = new MiddleoftheLinkedList_876();
        ListNode expected = var.middleNode(head);
        Assertions.assertTrue(CompareElements.compareListNodeElements(result, expected));
    }
}

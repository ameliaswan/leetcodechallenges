package dataStructures.linkedList;

import dataStructures.utilClasses.ListNode;
import dataStructures.utils.CompareElements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test_ReverseLinkedList_206 {



    @Test
    public void testMethod1Case1() {
        ListNode oriList = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5))));
        ListNode reverseList = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(1))));
// 1st method
        ReverseLinkedList_206 var = new ReverseLinkedList_206();
        ListNode expectedResult = var.reverseList(oriList);


        Assertions.assertTrue(CompareElements.compareListNodeElements(reverseList, expectedResult));

    }
    @Test
    public void testMethod2Case1() {
// 2nd method
        ListNode oriList2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5))));
        ListNode reverseList2 = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(1))));

        ReverseLinkedList_206 var2 = new ReverseLinkedList_206();
        ListNode expectedResult2 = var2.reverseList2(oriList2);

        Assertions.assertTrue(CompareElements.compareListNodeElements(reverseList2, expectedResult2));


    }






}

package dataStructures.linkedList;

import dataStructures.utilClasses.ListNode;
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

        boolean booResult = true;
        while (reverseList != null) {
            if (reverseList.val != expectedResult.val) {
                booResult = false;
                break;
            }
            reverseList = reverseList.next;
            expectedResult = expectedResult.next;
        }

        Assertions.assertTrue(booResult);

    }
    @Test
    public void testMethod2Case1() {
// 2nd method
        ListNode oriList2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5))));
        ListNode reverseList2 = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(1))));

        ReverseLinkedList_206 var2 = new ReverseLinkedList_206();
        ListNode expectedResult2 = var2.reverseList2(oriList2);

        boolean booResult2 = true;
        while(reverseList2.next != null){
            if(reverseList2.val != expectedResult2.val){
                booResult2 = false;
                break;
            }
            reverseList2 = reverseList2.next;
            expectedResult2 = expectedResult2.next;
        }

        Assertions.assertTrue(booResult2);


    }
}

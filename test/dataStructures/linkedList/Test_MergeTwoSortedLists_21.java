package dataStructures.linkedList;

import dataStructures.utilClasses.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_MergeTwoSortedLists_21 {

    @Test
    public void testMethod1Case1() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
// 1st method
        MergeTwoSortedLists_21 var = new MergeTwoSortedLists_21();
        ListNode expectedResult = var.mergeTwoLists(list1, list2);

        boolean booResult = true;
        while (result.next != null) {
            if (result.val != expectedResult.val) {
                booResult = false;
                break;
            }
            result = result.next;
            expectedResult = expectedResult.next;
        }

        Assertions.assertTrue(booResult);

    }

    @Test
    public void testMethod2Case1(){
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

// 2nd method
        MergeTwoSortedLists_21 var2 = new MergeTwoSortedLists_21();
        ListNode expectedResult2 = var2.mergeTwoLists2(list1, list2);


        boolean booResult2 = true;
        while(result.next != null){
            if(result.val != expectedResult2.val){
                booResult2 = false;
                break;
            }
            result = result.next;
            expectedResult2 = expectedResult2.next;
        }

        Assertions.assertTrue(booResult2);
    }


    @Test
    public void testMethod1Case2() {
        ListNode list1 = new ListNode(5);
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode result = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));

// 1st method
        MergeTwoSortedLists_21 var = new MergeTwoSortedLists_21();
        ListNode expectedResult = var.mergeTwoLists(list1, list2);

        boolean booResult = true;
        while (result.next != null) {
            if (result.val != expectedResult.val) {
                booResult = false;
                break;
            }
            result = result.next;
            expectedResult = expectedResult.next;
        }

        Assertions.assertTrue(booResult);
    }
    @Test
     public void testMethod2Case2(){
        ListNode list1 = new ListNode(5);
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode result = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));

// 2nd method
        MergeTwoSortedLists_21 var2 = new MergeTwoSortedLists_21();
        ListNode expectedResult2 = var2.mergeTwoLists2(list1, list2);

        boolean booResult2 = true;
        while(result.next != null){
            if(result.val != expectedResult2.val){
                booResult2 = false;
                break;
            }
            result = result.next;
            expectedResult2 = expectedResult2.next;
        }

        Assertions.assertTrue(booResult2);


    }
}

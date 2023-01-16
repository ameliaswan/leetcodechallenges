package dataStructures.heap;

import dataStructures.utilClasses.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test_Merge_k_Sorted_Lists_23 {
    @Test
    void Testcase1(){
        ListNode n1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode n2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode n3 = new ListNode(2, new ListNode(6));
        ListNode[] nodeLists = {n1, n2, n3};

        ListNode expected = new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(3,
                                                        new ListNode(4,
                                                                new ListNode(4,
                                                                        new ListNode(5,
                                                                                new ListNode(6))))))));
        ListNode result;

        Merge_k_Sorted_Lists_23 var = new Merge_k_Sorted_Lists_23();
        result = var.mergeKLists(nodeLists);

        Assertions.assertEquals(expected.toString(), result.toString());

    }

    @Test
    void Testcase2(){
        ListNode[] nodeLists = {};

        ListNode result;

        Merge_k_Sorted_Lists_23 var = new Merge_k_Sorted_Lists_23();
        result = var.mergeKLists(nodeLists);

        Assertions.assertNull(result);

    }

    @Test
    void Testcase3(){
        ListNode node = null;
        ListNode[] nodeLists = {node};

        ListNode result;

        Merge_k_Sorted_Lists_23 var = new Merge_k_Sorted_Lists_23();
        result = var.mergeKLists(nodeLists);

        Assertions.assertNull(result);

    }

}

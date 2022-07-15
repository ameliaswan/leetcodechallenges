package dataStructures.linkedList;

import dataStructures.utilClasses.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_LinkedListCycleII_142_M {

    @Test
    void testCase1(){
        ListNode node = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        LinkedListCycleII_142_M var = new LinkedListCycleII_142_M();
        ListNode expected = var.detectCycle(node);
        ListNode expectedSet = var.detectCycle_hashSet(node);
        ListNode expectedMap = var.detectCycle_hashMap(node);

        Assertions.assertEquals(node2.val, expected.val);
        Assertions.assertEquals(node2.val, expectedSet.val);
        Assertions.assertEquals(node2.val, expectedMap.val);

    }

    @Test
    void testCase2(){
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);

        node.next = node2;
        node2.next = node;

        LinkedListCycleII_142_M var = new LinkedListCycleII_142_M();
        ListNode expected = var.detectCycle(node);
        ListNode expectedSet = var.detectCycle_hashSet(node);
        ListNode expectedMap = var.detectCycle_hashMap(node);

        Assertions.assertEquals(node.val, expected.val);
        Assertions.assertEquals(node.val, expectedSet.val);
        Assertions.assertEquals(node.val, expectedMap.val);

    }

    @Test
    void testCase3(){
        ListNode node = new ListNode(3);
        ListNode node2 = new ListNode(7);

        node.next = node2;

        LinkedListCycleII_142_M var = new LinkedListCycleII_142_M();
        ListNode expected = var.detectCycle(node);
        ListNode expectedSet = var.detectCycle_hashSet(node);
        ListNode expectedMap = var.detectCycle_hashMap(node);

        Assertions.assertNull(expected);
        Assertions.assertNull(expectedSet);
        Assertions.assertNull(expectedMap);

    }
}

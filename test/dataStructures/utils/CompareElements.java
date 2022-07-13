package dataStructures.utils;

import dataStructures.utilClasses.ListNode;

public class CompareElements {

    public static boolean compareListNodeElements(ListNode head1, ListNode head2){
        boolean booResult = true;

        ListNode node1 = head1, node2 = head2;
        while (node1 != null) {
            if (node1.val != node2.val) {
                booResult = false;
                break;
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        if(node1 != null || node2 != null){
            booResult = false;
        }
        return booResult;
    }
}

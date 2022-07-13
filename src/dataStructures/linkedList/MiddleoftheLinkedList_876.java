package dataStructures.linkedList;


//https://leetcode.com/problems/middle-of-the-linked-list/

import dataStructures.utilClasses.ListNode;

public class MiddleoftheLinkedList_876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

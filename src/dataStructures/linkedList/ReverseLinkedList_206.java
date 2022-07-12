package dataStructures.linkedList;

import dataStructures.utilClasses.ListNode;


//https://leetcode.com/problems/reverse-linked-list/

public class ReverseLinkedList_206 {
    ListNode result = null;
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode before = head, current = head.next, next = head.next.next;
        before.next = null;
        while(next != null){
            current.next = before;

            before = current;
            current = next;
            next = next.next;
        }
        current.next = before;

        return current;
    }

    public ListNode reverseList2(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode before = head, current = head.next;
            before.next = null;
            goToNext(before, current);
            return result;
    }

    public void goToNext(ListNode before, ListNode current){
        if(current.next != null){
            goToNext(current, current.next);
        }else{
            result = current;
        }
        current.next = before;
    }

}

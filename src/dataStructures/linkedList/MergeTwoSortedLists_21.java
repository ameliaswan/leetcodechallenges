package dataStructures.linkedList;


import dataStructures.utilClasses.ListNode;


//https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeTwoSortedLists_21 {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
//         insert the 2nd list elements into the 1st list


        ListNode before = null;
        ListNode head = list1;
        while(list2 != null){
//            if list1 has ran out all elements while list2 still has remaining ones
            if(list1 == null){
                before.next = list2;
                break;
            }


            if(list2.val <= list1.val){
//                insert before current node
                ListNode newNode = new ListNode(list2.val, list1);

                if(before == null){
                    head = newNode;
                    before = head;
                }else{
                    before.next = newNode;
                    before = before.next;
                }

                list2 = list2.next;
            }else{
//                list1 move to next node
                before = list1;
                list1 = list1.next;
            }
        }

        return head;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }

        ListNode head = new ListNode();
        ListNode current = head;

        while(list1 != null && list2 != null){
            if(list2.val <= list1.val){
                current.next = new ListNode(list2.val);

                list2 = list2.next;
            }else{
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            current = current.next;
        }

        while(list1 != null){
            current.next = new ListNode(list1.val);
            current = current.next;
            list1 = list1.next;
        }

        while(list2 != null){
            current.next = new ListNode(list2.val);
            current = current.next;
            list2 = list2.next;
        }

        return head.next;
    }
}

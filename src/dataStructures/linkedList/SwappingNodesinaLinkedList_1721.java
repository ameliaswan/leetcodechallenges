package dataStructures.linkedList;

import dataStructures.utilClasses.ListNode;

public class SwappingNodesinaLinkedList_1721 {
    /**
     * This method swap the kth node from the beginning and kth node from the end
     * @param head  input Linked List
     * @param k number k
     * @return The Linked List that kth nodes are swapped
     */
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null) return head;
        //check the length of this linked list
        ListNode ranger = head, dummy = new ListNode();
        dummy.next = head;
        int len = 0;
        while(ranger != null){
            len++;
            ranger = ranger.next;
        }
        int kfromend = len - k;

        //pre_nodekfromstart and pre_nodekfromend are the (k-1)th nodes from beginning and end respectively
        //nodekfromstart and nodekfromend are the kth nodes from beginning and end respectively
        ListNode pre_nodekfromstart = null, pre_nodekfromend = null, nodekfromstart, nodekfromend;
        //use ranger pointer to loop through the list and identify pre_nodekfromstart and pre_nodekfromend
        ranger = head;
        //it only needs to loop till the bigger number of the index between (k-1)th nodes indexes
        int looplen = Math.max(k-2, kfromend-1);
        for(int i = 0; i <= looplen; i++){
            if(i == k-2) pre_nodekfromstart = ranger;
            if(i == kfromend-1) pre_nodekfromend = ranger;
            ranger = ranger.next;
        }
        //edge case 1: k equals 1. The pre_nodekfromstart is null;
        nodekfromstart = pre_nodekfromstart == null ? head : pre_nodekfromstart.next;
        if(pre_nodekfromstart == null) pre_nodekfromstart = dummy;
        //edge case 2: k equals the length of this Linked List. The pre_nodekfromend is null;
        nodekfromend = pre_nodekfromend == null ? head : pre_nodekfromend.next;
        if(pre_nodekfromend == null) pre_nodekfromend = dummy;

        //swap
        pre_nodekfromstart.next = nodekfromend;
        pre_nodekfromend.next = nodekfromstart;
        ListNode tmp = nodekfromstart.next;
        nodekfromstart.next = nodekfromend.next;
        nodekfromend.next = tmp;

        return dummy.next;


    }
}

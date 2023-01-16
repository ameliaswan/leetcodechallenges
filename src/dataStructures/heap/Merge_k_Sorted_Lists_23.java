package dataStructures.heap;

import dataStructures.utilClasses.ListNode;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists_23 {

    public ListNode mergeKLists(ListNode[] lists){
        ListNode sortedListNode = new ListNode();
        PriorityQueue pq = new PriorityQueue();

        for(int i = 0; i < lists.length; i++){
            ListNode tmp = lists[i];
            while(tmp != null){
                pq.add(tmp.val);
                tmp = tmp.next;
            }

        }
        ListNode head = sortedListNode;
        while(!pq.isEmpty()){
            sortedListNode.next = new ListNode((Integer) pq.remove());
            sortedListNode = sortedListNode.next;
        }

        return head.next;
    }
}

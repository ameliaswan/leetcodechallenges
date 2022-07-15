package dataStructures.linkedList;

import dataStructures.utilClasses.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/linked-list-cycle-ii/

public class LinkedListCycleII_142_M {
//    Floyd's tortoise and hare algorithm
    public ListNode detectCycle(ListNode head) {
         ListNode slow = head, fast = head;
         while(fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;

             // cycle detected, or slow and fast will never equals to each other
             if(slow == fast){
                 fast = head;
                 while(slow != fast){
                     slow = slow.next;
                     fast = fast.next;
                 }
                 return fast;
             }
         }
         return null;
    }




//    HashSet is used to save all the looped elements
    public ListNode detectCycle_hashSet(ListNode head) {
        Set eleSet = new HashSet<ListNode>();

         while(head != null){
             if(eleSet.contains(head)){
                 break;
             }else{
                 eleSet.add(head);
             }
             head = head.next;
         }

         return head;
    }



//    HashMap is used to save all the looped elements + the specific index if needed
    public ListNode detectCycle_hashMap(ListNode head) {
         Map elements = new HashMap<ListNode, Integer>();
         int idx = -1;

         while(head != null){
             if(elements.containsKey(head)){
                 break;
             }else{
                 elements.put(head, ++idx);
             }
             head = head.next;
         }


         return head;
    }
}

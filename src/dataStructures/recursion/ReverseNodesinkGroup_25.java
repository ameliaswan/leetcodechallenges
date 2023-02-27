package dataStructures.recursion;

import dataStructures.utilClasses.ListNode;

public class ReverseNodesinkGroup_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 0 || k == 1) return head;
        ListNode slow = head, fast = slow.next;
        ListNode dummy = new ListNode();
        head = dummy;

        dummy.next = helper(slow, slow, fast, slow, k);
        return head.next;
    }

    ListNode helper(ListNode begin, ListNode slow, ListNode fast, ListNode tmp, int k){
        //check if current tmplist is long enough to reverse
        int cnt = 0;
        while(cnt < k-1 && tmp != null){
            tmp = tmp.next;
            cnt++;
        }
        if(tmp == null) return begin;

        //reverse tmp list
        slow.next = null;
        while(fast != null && cnt > 0){
            tmp = fast.next;
            fast.next = slow;

            slow = fast;
            fast = tmp;
            cnt--;
        }
        begin.next = helper(fast, fast, fast == null ? null : fast.next, fast, k);
        return slow;



    }
}

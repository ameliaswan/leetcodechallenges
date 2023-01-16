package dataStructures.utilClasses;



public class ListNode{
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode tmp = this;
        while(tmp != null){
            sb.append(this.val).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }
}

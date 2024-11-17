package LinkedList;

public class PalindromeLinkedList {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reversal(slow);
        ListNode start=head;
        while(rev!=null){
            if(rev.val!=start.val){
                return false;
            }
            rev=rev.next;
            start=start.next;
        }
        return true;
    }
    public ListNode reversal(ListNode node){
        ListNode prev=null;
        while(node!=null){
            ListNode next=node.next;
            node.next=prev;
            prev=node;
            node=next;
        }
        return prev;
        
    }
}
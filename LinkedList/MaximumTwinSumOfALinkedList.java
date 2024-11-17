package LinkedList;
public class MaximumTwinSumOfALinkedList {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public int pairSum(ListNode head) {
        int res=0;
          ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reversal(slow);
        ListNode start=head;
        while(rev!=null){
           res=Math.max(res,rev.val+start.val);
            rev=rev.next;
            start=start.next;
        }
        return res;
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

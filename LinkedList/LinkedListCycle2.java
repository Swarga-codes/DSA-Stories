package LinkedList;

public class LinkedListCycle2 {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
        }
    public static void main(String[] args) {
        
    }
    public ListNode detectCycle(ListNode head) {
        if(isCycle(head)==null){
         return null;
        }
       ListNode tmp=head;
       ListNode res=isCycle(head);
         while(tmp!=res){
             tmp=tmp.next;
             res=res.next;
         }
         return res;
     }
     public ListNode isCycle(ListNode head){
  ListNode slow=head;
         ListNode fast=head;
         while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
             if(slow==fast){
                 return slow;
             }
         }
         return null;
     }
}

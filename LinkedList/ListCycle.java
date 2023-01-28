package LinkedList;

public class ListCycle {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode tmp1=head;
        ListNode tmp2=head;
        while(tmp2!=null && tmp2.next!=null){
            tmp1=tmp1.next;
            tmp2=tmp2.next.next;
            if(tmp1==tmp2){
                return true;
            }
        }
        return false;
    }
}

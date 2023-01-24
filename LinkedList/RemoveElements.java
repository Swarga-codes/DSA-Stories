public class RemoveElements {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode tmp=head;
        while(tmp!=null){
            if(tmp.next!=null && tmp.next.val==val){
                tmp.next=tmp.next.next;
            }
            else{
            tmp=tmp.next;
            }
        }
        return head;
    }
}

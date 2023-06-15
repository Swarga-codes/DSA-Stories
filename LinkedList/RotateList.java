package LinkedList;

public class RotateList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        if(k==0){
            return head;
        }
        ListNode t1=head;
        int size=0;
        while(t1!=null){
            size++;
            t1=t1.next;
        }
        if(k%size==0){
            return head;
        }
        if(k>size){
            k=k%size;
        }
          ListNode t2=head;
        for(int i=0;i<size-k;i++){
            t2=t2.next;
        }
        ListNode t4=head;
        for(int i=0;i<size-k-1;i++){
            t4=t4.next;
        }
        t4.next=null;
        ListNode t3=t2;
        while(t3.next!=null){
            t3=t3.next;
        }

        t3.next=head;
        head=t2;
        return head;
    }
}

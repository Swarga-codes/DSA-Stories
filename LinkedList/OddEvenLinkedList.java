package LinkedList;

public class OddEvenLinkedList {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode odd=new ListNode(head.val);
        ListNode even=new ListNode(head.next.val);
        ListNode oddTmp=odd;
        ListNode evenTmp=even;
        ListNode tmp=head.next.next;
        int k=1;
        while(tmp!=null){
            if(k%2!=0){
               oddTmp.next=new ListNode(tmp.val);
               oddTmp=oddTmp.next; 
            }
            else{
   evenTmp.next=new ListNode(tmp.val);
               evenTmp=evenTmp.next; 
            }
            k++;
            tmp=tmp.next;
        }
        oddTmp=odd;
        while(oddTmp.next!=null){
            oddTmp=oddTmp.next;
        }
        oddTmp.next=even;
        return odd;
    }
}

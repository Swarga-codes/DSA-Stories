public class MiddleOfLinkedList {
     public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        int size=0;
        ListNode tmp=head;
        while(tmp!=null){
            tmp=tmp.next;
            size++;
        }
        ListNode node=head;
        for(int i=1;i<=size/2;i++){
            node=node.next;
        }
        return node;
    }
    
}

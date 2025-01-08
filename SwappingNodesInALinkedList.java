public class SwappingNodesInALinkedList {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int len=0;
        ListNode tmp=head;
        while(tmp!=null){
            tmp=tmp.next;
            len++;
        }
        tmp=head;
        int first=0;
        int last=0;
        int i=0;
        ListNode firstNode=null,lastNode=null;

        while(tmp!=null && i<=len){
            if(i==k-1){
                first=tmp.val;
                firstNode=tmp;
            }
            if(i==len-k){
                last=tmp.val;
                lastNode=tmp;
            }
            tmp=tmp.next;
            i++;
    }
    firstNode.val=last;
    lastNode.val=first;
    return head;
}
}

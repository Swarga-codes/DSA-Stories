public class SwapNodesInPairs {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode tmp=head;
        ListNode rev=new ListNode(0);
        ListNode trev=rev;
        int i=0,len=0;
        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        tmp=head;
        while(i<len){
            if(len-i<2){
                trev.next=tmp;
                break;
            }
            else{
                ListNode dummy=tmp;
                for(int j=0;j<2;j++){
                    dummy=dummy.next;
                }
                trev.next=reverse(tmp);
                while(trev.next!=null){
                    trev=trev.next;
                }
                tmp=dummy;
                i+=2;
            }
        }
        
        return rev.next;
    }
    public static ListNode reverse(ListNode head){
        ListNode tmp=head;
        ListNode prev=null;
        int i=0;
        while(i<2){
            ListNode next=tmp.next;
            tmp.next=prev;
            prev=tmp;
            tmp=next;
            i++;
        }
        return prev;
    }
}

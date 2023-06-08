public class RemoveDuplicatesFromSortedLinkedLists {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
				
        ListNode tmp=head;
        while(tmp!=null){
            if(tmp.next==null){
                break;
            }
          while(tmp.val==tmp.next.val){
                if(tmp.next.next==null && tmp.val==tmp.next.val){
                tmp.next=null;
                break;
            }
                tmp.next=tmp.next.next;
            }
            tmp=tmp.next;
            
        }
        return head;
    }
}

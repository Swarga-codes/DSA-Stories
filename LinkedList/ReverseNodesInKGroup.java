package LinkedList;

public class ReverseNodesInKGroup {
    public class ListNode {
            int val;
            ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        int len=0;
        ListNode tmp=head;
        while(tmp!=null){
            tmp=tmp.next;
            len++;
        }
        if(len<k) return head;
        int i=0;
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        tmp=head;
        while(i<len){
            if(len-i<k){
                dummy.next=tmp;
                break;
            }
            else{
                //Note: the storetmp is needed to store the current state of tmp for its next iteration since after traversal tmp points differently as compared to the original linkedlist.
                ListNode storeTmp=tmp;
                for(int j=0;j<k;j++){
                    storeTmp=storeTmp.next;
                }
                dummy.next=reverse(tmp,k);
                while(dummy.next!=null){
                    dummy=dummy.next;
                }
                tmp=storeTmp;
                i+=k;
            }
        }
        return ans.next;
    }
    public ListNode reverse(ListNode head,int k){
        ListNode tmp=head;
        ListNode prev=null;
        int i=0;
        while(i<k){
            ListNode next=tmp.next;
            tmp.next=prev;
            prev=tmp;
            tmp=next;
            i++;
        }
        return prev;
    }
}

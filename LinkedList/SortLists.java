import java.util.*;
class SortLists{
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        left=sortList(left);
        right=sortList(right);
        return mergeLists(left,right);

    }
    public static ListNode mergeLists(ListNode l1,ListNode l2){
        ListNode merger=new ListNode(0);
        ListNode dummy=merger;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                dummy.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                dummy.next=new ListNode(l2.val);
                l2=l2.next;
            }
            dummy=dummy.next;
        }
        if(l1!=null) dummy.next=l1;
        if(l2!=null) dummy.next=l2;
        return merger.next;
            }
    public static ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
return slow;
    }
}
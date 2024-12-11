package LinkedList;
public class AddTwoNumbers {
     public class ListNode {
    int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode tmp1=l1;
    ListNode tmp2=l2;
    ListNode res=new ListNode(0);
    ListNode tmp3=res;
    int sum=0,carry=0;
    while(tmp1!=null && tmp2!=null){
        sum=tmp1.val+tmp2.val+carry;
        carry=sum/10;
        tmp3.next=new ListNode(sum%10);
        tmp3=tmp3.next;
        tmp1=tmp1.next;
        tmp2=tmp2.next;
    }
    while(tmp1!=null){
        sum=tmp1.val+carry;
        carry=sum/10;
        tmp3.next=new ListNode(sum%10);
        tmp3=tmp3.next;
        tmp1=tmp1.next;
    }
     while(tmp2!=null){
        sum=tmp2.val+carry;
        carry=sum/10;
        tmp3.next=new ListNode(sum%10);
        tmp3=tmp3.next;
        tmp2=tmp2.next;
    }
    if(carry!=0){
        tmp3.next=new ListNode(carry);
    }
    return res.next;
}
}

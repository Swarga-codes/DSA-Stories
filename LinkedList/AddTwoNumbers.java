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
        if(l1==null && l2==null){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode tmp=new ListNode(0);
        ListNode res=tmp;
       int carry=0;
       while(l1!=null && l2!=null){
           int sum=l1.val+l2.val+carry;
           carry=0;
           if(sum>9){
               carry=sum/10;
           }
            tmp.next=new ListNode(sum%10);
            tmp=tmp.next;
            l1=l1.next;
            l2=l2.next;
       }
       while(l1!=null){
           int sum=l1.val+carry;
           carry=0;
            if(sum>9){
               carry=sum/10;
           }
             tmp.next=new ListNode(sum%10);
            tmp=tmp.next;
                  l1=l1.next;
       }
         while(l2!=null){
           int sum=l2.val+carry;
           carry=0;
            if(sum>9){
               carry=sum/10;
           }
             tmp.next=new ListNode(sum%10);
            tmp=tmp.next;
                  l2=l2.next;
       }
       if(carry!=0){
           tmp.next=new ListNode(carry);
           tmp=tmp.next;
       }
       return res.next;
    }
}

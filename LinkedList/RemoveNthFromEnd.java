public class RemoveNthFromEnd {
    public int size=0;
   public RemoveNthFromEnd(){
 this.size=0;
   }
   public static void main(String[] args) {
    
   }
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
       
        public ListNode removeNthFromEnd(ListNode head, int n) {
          if(head==null){
            return null;
        }
        ListNode tmp=head;
        int size=0;
        while(tmp!=null){
            tmp=tmp.next;
            size++;
        }
     
        if(size==n){
            head=head.next;
            return head;
        }
        if(n>size){
            return null;
        }
       
      
       
        ListNode node=head;
        for(int i=1;i<=size-n-1;i++){
            node=node.next;
        }
        if(node.next==null){
        node.next=null;
        }
        else{
            node.next=node.next.next;
        }
        return head;
    }
    }

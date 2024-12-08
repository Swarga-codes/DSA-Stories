package LinkedList;
class AddOneToANumberRepresentedAsLinkedList{
    class Node{
        int data;
        Node next;
    
        Node(int x){
            data = x;
            next = null;
        }
    }
    public Node addOne(Node head) {
        Node rev=reverse(head);
        Node tmp=rev;
        int sum=tmp.data+1;
        tmp.data=sum%10;
        int carry=sum/10;
        
        while(tmp.next!=null || carry!=0){
            if(tmp.next==null){
                tmp.next=new Node(0);
            }
            tmp=tmp.next;
            sum=tmp.data+carry;
            tmp.data=sum%10;
            carry=sum/10;
            
        }
        
        Node res=reverse(rev);
        return res;
  
      }
      public Node reverse(Node head){
          Node prev=null;
          Node tmp=head;
          while(tmp!=null){
              Node next=tmp.next;
              tmp.next=prev;
              prev=tmp;
              tmp=next;
          }
          return prev;
      }
}
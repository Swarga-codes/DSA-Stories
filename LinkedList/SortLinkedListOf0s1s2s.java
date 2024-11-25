package LinkedList;

public class SortLinkedListOf0s1s2s {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    static Node segregate(Node head) {
        // add your code here
      Node tmp=head;
      Node zeroes=new Node(-1),ones=new Node(-1),twos=new Node(-1);
      Node t1=zeroes,t2=ones,t3=twos;
      while(tmp!=null){
          if(tmp.data==0){
              zeroes.next=new Node(tmp.data);
              zeroes=zeroes.next;
          }
          else if(tmp.data==1){
              ones.next=new Node(tmp.data);
              ones=ones.next;
          }
          else{
              twos.next=new Node(tmp.data);
              twos=twos.next;
          }
          tmp=tmp.next;
      }
     zeroes.next=t2.next!=null?t2.next:t3.next;
     ones.next=t3.next;
     twos.next=null;
     return t1.next;
     
    }
}
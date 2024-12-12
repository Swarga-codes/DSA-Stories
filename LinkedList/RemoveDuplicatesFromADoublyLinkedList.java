package LinkedList;

public class RemoveDuplicatesFromADoublyLinkedList {
    class Node{
        int data;
        Node next, prev;
        Node(int x){
            this.data = x;
            this.next = null;
            this.prev = null;
        }
    }
    Node removeDuplicates(Node head){
        // Code Here.
        Node tmp=head;
        while(tmp!=null && tmp.next!=null){
            while(tmp.next!=null && tmp.data==tmp.next.data){
                    tmp.next=tmp.next.next;
                }
                if(tmp.next!=null){
                tmp.next.prev=tmp;
                }
                   tmp=tmp.next;
            }
            
          return head;
            
        }
}

package LinkedList;

public class DeleteAllTheOccurencesOfAGivenKeyInADoublyLinkedList {
    class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        if(head==null) return head;
        Node tmp=head;
        while(tmp.data==x){
            tmp=tmp.next;
        }
        Node res=tmp;
        while(tmp.next!=null){
            if(tmp.next.data==x){
                if(tmp.next.next!=null){
                    tmp.next=tmp.next.next;
                }
                tmp.next.prev=tmp;
            }
            tmp=tmp.next;
        }
        if(tmp.data==x){
            tmp=tmp.prev;
            tmp.next=null;
        }
        return res;
    }
    
}
}

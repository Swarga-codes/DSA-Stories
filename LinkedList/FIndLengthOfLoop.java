package LinkedList;

public class FIndLengthOfLoop {
    class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

    public static int countNodesinLoop(Node head) {
        // Add your code here.
        int count=0;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                count=1;
                slow=slow.next;
                while(slow!=fast){
                    slow=slow.next;
                    count++;
                }
                
                return count;
            }
        }
        return count;
        
    }
}

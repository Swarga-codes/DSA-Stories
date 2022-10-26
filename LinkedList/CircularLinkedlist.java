package LinkedList;

public class CircularLinkedlist {
    Node head;
    Node tail;
    public CircularLinkedlist(){
        this.head=null;
        this.tail=null;
    }
  public void insert(int val){
    Node node=new Node(val);
    if(head==null){
        head=node;
        tail=node;
    }
    tail.next=node;
    node.next=head;
    tail=node;
  }
  public void delete(int val){
    Node node=head;
 if(node==null){
    return;
 }
  if(node.data==val){
    head=head.next;
    tail.next=head;
    return;
  }
  do{
    Node n=node.next;
    if(n.data==val){
node.next=n.next;
break;
    }
    node=node.next;
  }while(node!=head);
  }
  public void display(){
Node node=head;
if(head!=null){
    do{
        System.out.print(node.data+"->");
        node=node.next;
    }while(node!=head);
    System.out.print("HEAD");
}
  }
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }   
}

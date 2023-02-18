package LinkedList;

public class MergeTwoSortedLists {
    Node head;
    Node tail;
    public MergeTwoSortedLists(){
        this.head=null;
        this.tail=null;
    }
    public Node mergeTwoLists(Node list1, Node list2) {
        if(list1==null && list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
    return list1;
        }
                
            list2.next=mergeTwoLists(list1,list2.next);
                    return list2;
        
    }
    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    } 
}

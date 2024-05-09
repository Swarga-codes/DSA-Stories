package LinkedList;

import java.util.Stack;

public class RemoveNodesFromLinkedList {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode removeNodes(ListNode head) {
        if(head==null) return head;
        ListNode tmp=head;
       Stack<ListNode> st=new Stack<>();
       while(tmp!=null){
        while(!st.isEmpty() && st.peek().val<tmp.val){
            st.pop();
        }
            st.push(tmp);
        
        tmp=tmp.next;
       }
       ListNode res=new ListNode(0);
       ListNode itr=res;
       for(ListNode el:st){
        itr.next=el;
        itr=itr.next;
       }
       return res.next;
    }
}

package LinkedList;

import java.util.HashSet;

public class IntersectionOfTwoLinkedLists {
    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode tmp=headA;
        while(tmp!=null){
            set.add(tmp);
            tmp=tmp.next;
        }
        tmp=headB;
        while(tmp!=null){
            if(set.contains(tmp)){
                return tmp;
            }
            tmp=tmp.next;
        }
        return tmp;
    }
}
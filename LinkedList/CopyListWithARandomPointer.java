package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithARandomPointer {
    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
     public Node copyRandomList(Node head) {
        Node res=new Node(0);
        Node tmp=head;
        Node dummy=res;
        Map<Node,Integer> map=new HashMap<>();
        Map<Integer,Node> resMap=new HashMap<>();
        int idx=0;
        while(tmp!=null){
            dummy.next=new Node(tmp.val);
            map.put(tmp,idx);
            resMap.put(idx,dummy.next);
            idx++;
            dummy=dummy.next;
            tmp=tmp.next;
        }
        tmp=head;
        dummy=res.next;
        while(tmp!=null){
            if(tmp.random==null){
                dummy.random=null;
            }
            else{
                dummy.random=resMap.get(map.get(tmp.random));
            }
            tmp=tmp.next;
            dummy=dummy.next;
        }
        return res.next;
    }
}
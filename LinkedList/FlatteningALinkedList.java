package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlatteningALinkedList {
    class Node {
        int data;
        Node next;
        Node bottom;
    
        Node(int x) {
            data = x;
            next = null;
            bottom = null;
        }
    }
     Node flatten(Node root) {
        // code here
        List<Node> list=new ArrayList<>();
        Node leftToRight=root;
        while(leftToRight!=null){
            Node topToBottom=leftToRight;
            while(topToBottom!=null){
                list.add(topToBottom);
                topToBottom=topToBottom.bottom;
            }
            leftToRight=leftToRight.next;
        }
        Collections.sort(list,(a,b)->a.data-b.data);
        Node res=new Node(0);
        Node tmp=res;
        for(int i=0;i<list.size();i++){
            tmp.bottom=list.get(i);
            tmp=tmp.bottom;
        }
        return res.bottom;
    }
}

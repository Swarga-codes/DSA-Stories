package LinkedList;

import java.util.ArrayList;

public class FindPairsWithGivenSumInADoublyLinkedList {
    class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
      public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Node start=head;
        Node end=head;
        while(end.next!=null){
            end=end.next;
        }
       while(start.data<end.data){
           if(start.data+end.data==target){
               ArrayList<Integer> pair=new ArrayList<>();
               pair.add(start.data);
               pair.add(end.data);
               res.add(pair);
               start=start.next;
               end=end.prev;
           }
           else if(start.data+end.data>target){
               end=end.prev;
           }
           else{
               start=start.next;
           }
       }
        return res;
    }
}

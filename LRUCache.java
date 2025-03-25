import java.util.*;
class LRUCache {
    class LL{
        int key;
        int val;
        LL next;
        LL prev;
        LL(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    int capacity=0;
    Map<Integer,LL> map;
    LL head,tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new LL(-1,-1);
        tail=new LL(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            LL temp=map.get(key);
            LL prev=temp.prev;
            LL next=temp.next;
            prev.next=next;
            next.prev=prev;
            LL tmp2=head.next;
            head.next=temp;
            temp.prev=head;
            temp.next=tmp2;
            tmp2.prev=temp;
            return temp.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            LL temp=map.get(key);
            temp.val=value;
            LL prev=temp.prev;
            LL next=temp.next;
            prev.next=next;
            next.prev=prev;
        }
        else if(map.size()==capacity){
          LL tmp=tail.prev;
          LL tmp2=tmp.prev;
          tmp2.next=tail;
            tail.prev=tmp2;
          map.remove(tmp.key); 
        }
            LL node=new LL(key,value);
            LL tmp=head.next;
            head.next=node;
            node.prev=head;
            node.next=tmp;
            tmp.prev=node;
            map.put(key,node);
    }
}
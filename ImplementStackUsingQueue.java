import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
     Queue<Integer> q1,q2;
    public ImplementStackUsingQueue() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
    }
    
    public int pop() {
        if(q1.isEmpty()){
            return -1;
        }
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.size()==0;
    }
}

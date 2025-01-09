import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(4);
        s.push(5);
        s.push(7);
        reverse(s);
        System.out.println(s);
    }
     static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushToBottom(s,top);
    }
    static void pushToBottom(Stack<Integer> s,int top){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int x=s.pop();
        pushToBottom(s,top);
        s.push(x);
    }
}

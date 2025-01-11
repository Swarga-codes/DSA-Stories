import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(2);
        s.push(1);
        s.push(9);
        System.out.println(sort(s));
    }
    public static Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        solve(s);
        return s;
    }
    public static void solve(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        solve(s);
        sorting(s,top);
        
    }
    public static void sorting(Stack<Integer> s,int top){
        if(s.isEmpty() || top>s.peek()){
            s.push(top);
            return;
        }
        int x=s.pop();
        sorting(s,top);
        s.push(x);
    }
}

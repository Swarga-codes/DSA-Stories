import java.util.Stack;

public class OnlineStockSpan {
      class Pair{
    int val;
    int idx;
    public Pair(int val,int idx){
        this.val=val;
        this.idx=idx;
    }
}
Stack<Pair> st;
int idx;
    public OnlineStockSpan() {
        st=new Stack<>();
        st.push(new Pair(-1,-1));
        idx=0;
    }
    
    public int next(int price) {
        int res=0;
        while(!st.isEmpty() && price>=st.peek().val){
            st.pop();
        }
        if(st.isEmpty()){
            res=idx+1;
        }
        else{
            res=idx-st.peek().idx;
        }
        st.push(new Pair(price,idx++));
        return res;
    }
}

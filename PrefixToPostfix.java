import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String pre_exp="*-A/BC-/AKL";
        System.out.println(preToPost(pre_exp));
    }
     static String preToPost(String pre_exp) {
        // code here
        Stack<String> st=new Stack<>();
        for(int i=pre_exp.length()-1;i>=0;i--){
           char ch=pre_exp.charAt(i);
            if(isOperator(ch)){
                String x=st.pop();
                String y=st.pop();
                String gen=x+y+ch;
                st.push(gen);
            }
            else{
                st.push(ch+"");
            }
        }
        return st.pop();
    }
    static boolean isOperator(char ch){
        if(ch=='^' || ch=='+' || ch=='-' || ch=='*' || ch=='/') return true;
        return false;
    }
}

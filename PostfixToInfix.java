import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String exp="ab*c+";
        System.out.println(postToInfix(exp));
    }
      static String postToInfix(String exp) {
        // code here
        Stack<String> st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(isOperator(ch)){
                String x=st.pop();
                String y=st.pop();
                String gen="("+y+ch+x+")";
                st.push(gen);
            }
            else{
                st.push(ch+"");
            }
        }
        return st.pop();
    }
    static boolean isOperator(char c){
        if(c=='^' || c=='*' || c=='/' || c=='-' || c=='+') return true;
        return false;
    }
}
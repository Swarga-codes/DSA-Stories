import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String pre_exp="*-A/BC-/AKL";
        System.out.println(preToInfix(pre_exp));
    }
     static String preToInfix(String pre_exp) {
        // code here
        String s=pre_exp;
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
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
        String res=reversal(st.pop());
    return res;
        
    }
    static boolean isOperator(char ch){
        if(ch=='^' || ch=='/' || ch=='*' || ch=='+' || ch=='-') return true;
        return false;
    }
    static String reversal(String str){
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='('){
                res+=")";
            }
            else if(str.charAt(i)==')'){
                res+="(";
            }
            else{
                res+=str.charAt(i);
            }
        }
        return res;
    }
}

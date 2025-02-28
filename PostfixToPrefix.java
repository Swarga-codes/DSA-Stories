import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String post_exp="ABC/-AK/L-*";
        System.out.println(postToPre(post_exp));
    }
     static String postToPre(String post_exp) {
        // code here
         Stack<String> st=new Stack<>();
        for(int i=0;i<post_exp.length();i++){
           char ch=post_exp.charAt(i);
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
        String res=reversal(st.pop());
        return res;
    }
     static boolean isOperator(char ch){
        if(ch=='^' || ch=='+' || ch=='-' || ch=='*' || ch=='/') return true;
        return false;
    }
    static String reversal(String s){
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length()/2;i++){
            swap(ch,i,s.length()-i-1);
        }
        return new String(ch);
    }
    static void swap(char[] ch,int i,int j){
        char tmp=ch[i];
        ch[i]=ch[j];
        ch[j]=tmp;
    }
}

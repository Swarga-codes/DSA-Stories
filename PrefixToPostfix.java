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
    static String reversal(String s){
       int i=0,j=s.length()-1;
       char[] ch=s.toCharArray();
       while(i<=j){
           if(isOperator(ch[i])){
               i++;
           }
           if(isOperator(ch[j])){
               j--;
           }
           else{
               swap(ch,i,j);
               i++;
               j--;
           }
       }
       return new String(ch);
        
    }
    static void swap(char[] ch,int i,int j){
        char tmp=ch[i];
        ch[i]=ch[j];
        ch[j]=tmp;
    }
}

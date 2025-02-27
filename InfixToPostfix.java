import java.util.*;
class InfixToPostfix{
    public static void main(String[] args){
        String s="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(s));
    }
    public static String infixToPostfix(String s) {
        // Your code here
        String res="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='0' && ch<='9') || (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                res+=ch;
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res+=st.pop();
                }
                st.pop();
            }
            else if(ch=='('){
                st.push(ch);
                }
            else if(!st.isEmpty() && precedence(ch)<=precedence(st.peek())){
                while(!st.isEmpty() && precedence(ch)<=precedence(st.peek())){
                    res+=st.pop();
                }
                st.push(ch);
            }
            else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
    public static int precedence(char ch){
        if(ch=='^') return 3;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='+' || ch=='-') return 1;
        return 0;
    }
}
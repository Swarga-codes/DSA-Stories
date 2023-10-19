package StacksQueues;
import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        StringBuilder x=new StringBuilder();
        StringBuilder y=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)=='#'){
              st.pop();
            }
           else if(s.charAt(i)!='#'){
                    st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            x.append(st.pop());
        } 
          for(int i=0;i<t.length();i++){
            if(!st.isEmpty() && t.charAt(i)=='#'){
              st.pop();
            }
            else if(t.charAt(i)!='#'){
                    st.push(t.charAt(i));
            }
        }
         while(!st.isEmpty()){
            y.append(st.pop());
        } 
        return x.toString().equals(y.toString()); 
    }
}

/**
 * MinimumAddToMakeParenthesesValid
 */
import java.util.*;
 public class MinimumAddToMakeParenthesesValid {
public static void main(String[] args) {
    String s="())";
    System.out.println(minAddToMakeValid(s));
}
public static int minAddToMakeValid(String s) {
    Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++){
        if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='('){
            st.pop();
        }
        else{
            st.push(s.charAt(i));
        }
    }
    return st.size();
    
}
    
}
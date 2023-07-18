package StacksQueues;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
     public static boolean isValid(String s) {
      if(s.length()%2!=0) return false;
      Stack<String> st=new Stack<>();
      int k=0;
      for(int i=0;i<s.length();i++){
          if((s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')){
              st.push(s.charAt(i)+"");
              k++;
          }
        
          else if(!st.isEmpty() && ((st.peek().equals("(") && s.charAt(i)==')') || (st.peek().equals("{") && s.charAt(i)=='}') || (st.peek().equals("[") && s.charAt(i)==']'))){
              st.pop();
              k++;
              }
                else if(!st.isEmpty() && st.peek().charAt(0)!=s.charAt(i) && (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')){
                  return false;
              }
          }
           
        
      if(st.isEmpty() && s.length()==k){
          return true;
      }
      return false;
       
    }
}

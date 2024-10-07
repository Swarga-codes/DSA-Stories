import java.util.*;
class MinimumStringLengthAfterRemovingSubstrings{
    public static void main(String[] args){
        String s="ABFCACDB";
        System.out.println(minLength(s));
    }
    public static int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)=='B' && st.peek()=='A'){
                st.pop();
                }
                else if(!st.isEmpty() && s.charAt(i)=='D' && st.peek()=='C'){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
        }
        
        return st.size();
    }
}
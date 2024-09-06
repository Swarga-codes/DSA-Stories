import java.util.*;
class MaximumNestingDepthOfTheParentheses{
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else if(s.charAt(i)==')'){
                if(st.size()>max){
                    max=st.size();
                }
                st.pop();
            }
        }
        return max;
    }
}
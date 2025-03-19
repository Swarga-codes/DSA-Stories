import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        String num="10";
        int k=1;
        System.out.println(removeKdigits(num, k));
    }
     public static String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && num.charAt(i)<st.peek()){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k!=0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        sb.reverse();
        int lead=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='0'){
                break;
            }
            lead++;
        }
        String res=sb.toString().substring(lead);
        return res.equals("")?"0":res;
    }
}

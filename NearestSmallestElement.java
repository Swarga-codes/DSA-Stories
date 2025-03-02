import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestElement {
    public static void main(String[] args) {
        int[] A={4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(prevSmaller(A)));
    }
     public static int[] prevSmaller(int[] A) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            while(!st.isEmpty() && st.peek()>=A[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=st.peek();
            }
            else{
                ans[i]=-1;
            }
            st.push(A[i]);
        }
        return ans;
    }
}

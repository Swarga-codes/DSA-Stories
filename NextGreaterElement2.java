import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int[] res=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<res.length;i++){
            res[i]=-1;
        }
        for(int i=2*nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
                st.pop();
            }
            if(!st.isEmpty()){
                res[i%nums.length]=st.peek();
            }
            st.push(nums[i%nums.length]);
        }
        return res;
    }
}

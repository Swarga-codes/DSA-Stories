import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1={4,1,2},nums2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Map<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            if(st.isEmpty()){
                mp.put(nums2[i],-1);
                st.push(nums2[i]);
            }
            else if(nums2[i]<st.peek()){
                mp.put(nums2[i],st.peek());
                st.push(nums2[i]);
            }
            else{
                while(!st.isEmpty() && nums2[i]>st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    mp.put(nums2[i],-1);
                }
                else{
                    mp.put(nums2[i],st.peek());
                }
                st.push(nums2[i]);
            }
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=mp.get(nums1[i]);
        }
        return ans;
    }
}

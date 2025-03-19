import java.util.*;
class SumOfSubarrayRanges{
    public static void main(String[] args){
        int[] nums={1,2,3};
        System.out.println(subArrayRanges(nums));
    }
    public static long subArrayRanges(int[] nums) {
        int[] pse=prevSE(nums);
        int[] nse=nextSE(nums);
        int[] nge=nextGE(nums);
        int[] pge=prevGE(nums);
        long max=0,min=0;
        for(int i=0;i<nums.length;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            min=min+(left*right*nums[i]);
            left=i-pge[i];
            right=nge[i]-i;
            max=max+(left*right*nums[i]);
        }
        return max-min;
    }
    public static int[] prevSE(int[] nums){
        int[] pse=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
    return pse;
    }
    public static int[] nextSE(int[] nums){
        int[] nse=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=nums.length;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
    return nse;
    }
    public static int[] nextGE(int[] nums){
        int[] nge=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=nums.length;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(i);
        }
    return nge;
    }
    public static int[] prevGE(int[] nums){
          int[] pge=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>=nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pge[i]=-1;
            }
            else{
                pge[i]=st.peek();
            }
            st.push(i);
        }   
    return pge;
    }
}
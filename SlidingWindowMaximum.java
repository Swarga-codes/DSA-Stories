import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
     public static int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums;
        int[] res=new int[nums.length-k+1];
        int idx=0;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(i>=k && nums[i-k]==dq.peekLast()){
                dq.pollLast();
            }
            while(!dq.isEmpty() && nums[i]>dq.peek()){
                dq.pollFirst();
            }
            dq.addFirst(nums[i]);
            if(i>=k-1){
                res[idx++]=dq.peekLast();
            }
        }
        
        return res;
    }
}

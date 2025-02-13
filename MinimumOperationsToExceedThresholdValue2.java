import java.util.PriorityQueue;

public class MinimumOperationsToExceedThresholdValue2 {
    public static void main(String[] args) {
        int[] nums={2,11,10,1,3};
        int k=10;
        System.out.println(minOperations(nums, k));
    }
     public static int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add((long)nums[i]);
        }
        int res=0;
        while(pq.peek()<k){
            long x=pq.poll();
            long y=pq.poll();
            long op=Math.min(x,y)*2+Math.max(x,y);
            res++;
            pq.add(op);
        }
        return res;
    }
}

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumOperationsToHalveArraySum {
    public static void main(String[] args) {
        int[] nums={5,19,8,1};
        System.out.println(halveArray(nums));
    }
     public static int halveArray(int[] nums) {
        if(nums.length<2) return 1;
        double sum=0;
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            sum+=num;
            pq.add((double)num);
        }
        double curr=sum;
        sum=sum/2;
        int res=0;
        while(curr>sum){
            double max=pq.poll();
            curr=curr-max;
            max=max/2;
            curr=curr+max;
            pq.add(max);
            res++;
        }
        return res;

    }
}

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinimumOperationsToExceedThresholdValueI {
    public static void main(String[] args) {
       int[] nums={2,11,10,1,3};
       int k=10;
       System.out.println(minOperations(nums, k)); 
    }
     public static int minOperations(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(Integer num:list){
            pq.add(num);
        }
        int res=0;
        while(pq.peek()<k){
            int small=pq.poll();
            list.remove(Integer.valueOf(small));
        res++;
        }
        return res;
    }
}

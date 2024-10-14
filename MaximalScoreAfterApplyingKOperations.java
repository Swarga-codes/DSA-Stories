import java.util.*;
public class MaximalScoreAfterApplyingKOperations{
    public static void main(String[] args){
        int[] nums={1,10,3,3,3};
        int k=3;
        System.out.println(maxKelements(nums, k));

    }
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        long score=0;
        for(int num:nums){
            pq.add(num);
        }
        for(int i=1;i<=k;i++){
            int max=pq.poll();
            score+=max;
            int el=max%3==0?max/3:(max/3)+1;
            pq.add(el);
        }
        return score;
    }
}
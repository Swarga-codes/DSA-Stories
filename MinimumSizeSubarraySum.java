public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int s=0,initial=0,fin=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
            while(s>=target){
                s=s-nums[initial];
                 min=Math.min(min,fin-initial+1);
                initial++;
            }
            fin++;
        }
        if(min==Integer.MAX_VALUE){ 
            return 0;
        }
             return min; 
    }
}

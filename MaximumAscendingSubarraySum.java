public class MaximumAscendingSubarraySum {

    public static void main(String[] args) {
        int[] nums={10,20,30,5,30,90};
        System.out.println(maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        int sum=nums[0],res=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum+=nums[i+1];
            }
            else{
                res=Math.max(res,sum);
                sum=nums[i+1];
            }
        }
        return Math.max(sum,res);
    }
}
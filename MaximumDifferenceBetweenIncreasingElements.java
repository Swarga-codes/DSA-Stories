public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        int[] nums={7,1,5,4};
        System.out.println(maximumDifference(nums));
    }
    public static int maximumDifference(int[] nums) {
        int max=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
         min=Math.min(min,nums[i]);
         max=Math.max(max,nums[i]-min);
        }
        return max==0?-1:max;
    }
}

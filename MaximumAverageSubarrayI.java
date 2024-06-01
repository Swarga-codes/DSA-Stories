public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums, k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double sum=0,maxSum=Integer.MIN_VALUE;
        int i=0,m=0;
        for(i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=Math.max(maxSum,sum/k);
        while(i<nums.length){
            sum-=nums[m++];
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum/k);
            i++;
        }
       return maxSum;
    }
}

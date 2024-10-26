public class MaximumSumWithExactlyKElements {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int k=3;
        System.out.println(maximizeSum(nums, k));
    }
    public static int maximizeSum(int[] nums, int k) {
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=1;i<=k;i++){
            sum+=max;
            max++;
        }
        return sum;
    }
}

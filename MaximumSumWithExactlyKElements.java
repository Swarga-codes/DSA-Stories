import java.util.Arrays;

public class MaximumSumWithExactlyKElements {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int k=3;
        System.out.println(maximizeSum(nums, k));
    }
    public static int maximizeSum(int[] nums, int k) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=1;i<=k;i++){
            sum+=nums[nums.length-1];
            nums[nums.length-1]++;
        }
        return sum;
    }
}

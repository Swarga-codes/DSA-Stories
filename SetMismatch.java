import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums={1,2,2,3};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int repeating=0,missing=0;
        int n=nums.length;
        long currentSum=0,currentSquaredSum=0,requiredSum=0,requiredSquaredSum=0,sum=0,diff=0;
        for(int i=0;i<n;i++){
            currentSum+=nums[i];
            currentSquaredSum+=(long)nums[i]*nums[i];
        }
        requiredSum=(n*(n+1L))/2;
        requiredSquaredSum=(n*(n+1L)*(2L*n+1))/6;
        diff=currentSum-requiredSum;
        sum=(currentSquaredSum-requiredSquaredSum)/diff;
        repeating=(int)((sum+diff)/2);
        missing=(int)(repeating-diff);
        return new int[]{repeating,missing};
    }
}

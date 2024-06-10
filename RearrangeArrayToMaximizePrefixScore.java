import java.util.Arrays;

public class RearrangeArrayToMaximizePrefixScore {
    public static void main(String[] args) {
        int[] nums={2,-1,0,1,-3,3,-3};
        System.out.println(maxScore(nums));
    }
    public static int maxScore(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        int counter=0;
        for(int i=nums.length-1;i>=0;i--){
            if(sum+nums[i]>0){
                sum+=nums[i];
                counter++;
            }
            else{
                break;
            }
        }
        return counter;
    }
}

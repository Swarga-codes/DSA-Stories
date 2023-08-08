import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
       int[] arr={1,2,1,0};
       System.out.println(longestConsecutive(arr)); 
    }
     public static int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        Arrays.sort(nums);
        int k=1,max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
            if(nums[i]==nums[i-1]+1){
                k++;
            }
            else{
                max=Math.max(max,k);
                k=1;
            }
            }
        }
        return Math.max(max,k);
    }
}

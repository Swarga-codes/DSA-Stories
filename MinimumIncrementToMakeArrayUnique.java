import java.util.*;
public class MinimumIncrementToMakeArrayUnique {
    public static void main(String[] args) {
        int[] nums={1,2,2,6,3};
        System.out.println(minIncrementForUnique(nums));
    }
    public static int minIncrementForUnique(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
           if(nums[i]<=nums[i-1]){
            int steps=nums[i-1]-nums[i]+1;
            ans+=steps;
            nums[i]+=steps;
           } 
        }
        return ans;
    }
}

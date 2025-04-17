import java.util.*;

public class CountNumberOfNiceSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3;
        System.out.println(numberOfSubarrays(nums, k));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0) nums[i]=1;
            else nums[i]=0;
        }
        return helper(nums,k)-helper(nums,k-1);
    }
    public static int helper(int[] nums,int k){
        int r=0,l=0,res=0,sum=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            while(sum>k){
                sum-=nums[l]%2;
                l++;
            }
            res+=(r-l+1);
            r++;
        }
        return res;
    }
}

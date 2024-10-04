import java.util.*;
class MaxNumberOfKSumPairs{
    public static void main(String[] args){
int[] nums={1,2,3,4};
int k=5;
System.out.println(maxOperations(nums,k));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int res=0;
        while(i<j){
            if(nums[i]+nums[j]==k){
                res++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return res;
    }
}
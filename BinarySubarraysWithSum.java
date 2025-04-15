public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        int[] nums={1,0,1,0,1};
        int goal=2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
    public static int helper(int[] nums,int goal){
        if(goal<0) return 0;
        int l=0,r=0,sum=0,res=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            res+=(r-l+1);
            r++;
        }
        return res;
    }
}

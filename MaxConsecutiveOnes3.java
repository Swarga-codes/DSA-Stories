public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,0,0,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(nums, k));
    }
    public static int longestOnes(int[] nums, int k) {
        int curr=0,res=0;
       int l=0,r=0,zeroes=0;
       while(r<nums.length){
        if(nums[r]==0) zeroes++;
        while(zeroes>k){
            if(nums[l]==0) zeroes--;
            l++;
        }
        if(zeroes<=k){
            curr=r-l+1;
            res=Math.max(res,curr);
            r++;
        }
       }
        return res;
    }
}

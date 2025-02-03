public class LongestStrictlyIncreasingOrDecreasingSubarray {
    public static void main(String[] args) {
        int[] nums={1,10,10};
        System.out.println(longestMonotonicSubarray(nums));
    }
    public static int longestMonotonicSubarray(int[] nums) {
        int inc=1,dec=1,res=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                inc++;
            }
            else{
                res=Math.max(res,inc);
                inc=1;
               
            }
        }
        res=Math.max(res,inc);
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                dec++;
            }
            else{
                res=Math.max(res,dec);
                dec=1;
            }
        }
        res=Math.max(res,dec);
        return res;
    }
}
public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
       int[] nums={7,5,6,8,3}; 
       System.out.println(findGCD(nums));
    }
    public static int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int res=1;
        for(int i=1;i<=max;i++){
            if(max%i==0 && min%i==0){
                res=i;
            }
        }
        return res;
    }
}

public class MaximumCountOfPositiveAndNegative {
    public static void main(String[] args) {
        int[] nums={-1,-2,5,6,8};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        int p=0,n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                n++;
            }
            else if(nums[i]>0){
                p++;
            }
            else{
                continue;
            }
        }
        return Math.max(p,n);
    }
}

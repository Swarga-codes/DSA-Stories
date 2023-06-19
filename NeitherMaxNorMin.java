public class NeitherMaxNorMin {
    public static void main(String[] args) {
        int[] nums={2,4,24};
        System.out.println(findNonMinOrMax(nums));
    }
    public static int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max(nums) && nums[i]!=min(nums)){
                return nums[i];
            }
        }
        return -1;
    }
    public static int max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
     public static int min(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
    }
}

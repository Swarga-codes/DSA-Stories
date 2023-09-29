public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums={1,2,2,3};
        System.out.println(isMonotonic(nums));
    }
    public static boolean isMonotonic(int[] nums) {
        boolean f1=true,f2=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                f1=false;
                break;
            }
        }
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                f2=false;
                break;
            }
        }
        return f1||f2;
    }
}

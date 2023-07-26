public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums={1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
                return i;
            }
        }
        return maxi(nums);
    }
    public static int maxi(int[] nums){
        int pos=0;
        for(int i=1;i<nums.length;i++){
            if(nums[pos]<nums[i]){
                pos=i;
            }
        }
        return pos;
    }
}

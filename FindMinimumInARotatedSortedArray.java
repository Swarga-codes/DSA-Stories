public class FindMinimumInARotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        System.out.println(findMin(nums));
    }
      public static int findMin(int[] nums) {
        if(nums[0]<=nums[nums.length-1]){
            return nums[0];
        }
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid>=1 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            else if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}

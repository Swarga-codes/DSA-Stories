public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums={1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int l=1,h=nums.length-2,mid;
        while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
              return mid;
                
            }
            else if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }
            else if(nums[mid]>nums[mid+1]){
                h=mid-1;
            }
        }
        return -1;
    }
}

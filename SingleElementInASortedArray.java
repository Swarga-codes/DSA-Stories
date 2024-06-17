public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        int l=0,h=nums.length-1,mid;
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[h]!=nums[h-1]) return nums[h];
        l=1;
        h=nums.length-2;
        while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            else if(mid%2==0 && nums[mid]==nums[mid+1] || mid%2!=0 && nums[mid]==nums[mid-1]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
      
    }
}

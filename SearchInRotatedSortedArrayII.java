import java.util.Arrays;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums={1,0,1,1,1};
        int target=0;
        System.out.println(search(nums, target));
    }
     public static boolean search(int[] nums, int target) {
        int peak=findPeak(nums);
        int[] left=Arrays.copyOfRange(nums,0,peak);
        int[] right=Arrays.copyOfRange(nums,peak,nums.length);
      if(bsearch(left,target) || bsearch(right,target)){
          return true;
      }  
      return false;
    }
    public static boolean bsearch(int[] arr,int target){
        if(arr.length==1 && arr[0]==target){
            return true;
        }
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
    public static int findPeak(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return i+1;
            }
        }
        return 0;
    }
}

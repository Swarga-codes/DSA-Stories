public class FindTheSmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
         max=Math.max(max,nums[i]);
        }
        int low=1,high=max,mid;
       while(low<=high){
         mid=(low+high)/2;
         if(getMinDiv(nums,mid,threshold)){
            high=mid-1; 
         }   
         else{
             low=mid+1;
         }
       }
        return low;
     }
  public static boolean getMinDiv(int[] nums,int min,int threshold){
     int sum=0;
     for(int i=0;i<nums.length;i++){
         sum+=Math.ceil((double)nums[i]/min);
         if(sum>threshold){
             return false;
         }
     }
     return sum<=threshold;
  }   
}

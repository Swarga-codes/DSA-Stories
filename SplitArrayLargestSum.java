public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums={1,4,4};
        int k=3;
        System.out.println(splitArray(nums, k));
    }
    public static int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            sum+=nums[i];
        }

        int low=max,high=sum,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(isPossible(nums,mid,k)){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
    public static boolean isPossible(int[] arr,int possible,int k){
        int sum=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=possible){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
                count++;
            }
        }
        if(sum!=0){
            count++;
        }
        return count<=k;
    }
}

public class RemovingMaximumAndMinimumFromArray {
    public static void main(String[] args) {
        int[] nums={2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(nums));
    }
    public static int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE,idx1=0,idx2=0,max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                idx1=i;
            }
            if(nums[i]<min){
                min=nums[i];
                 idx2=i;
            }
        }
      int minAndMaxFromFront=Math.max(idx1,idx2)+1;
      int minAndMaxFromBack=n-Math.min(idx1,idx2);
      int minFromFrontAndMaxFromBack=idx2+1+(n-idx1);
      int minFromBackAndMaxFromFront=idx1+1+(n-idx2);
        
        return Math.min(Math.min(minAndMaxFromFront,minAndMaxFromBack),Math.min(minFromFrontAndMaxFromBack,minFromBackAndMaxFromFront));
    }
}

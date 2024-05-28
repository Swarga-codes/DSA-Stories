public class MissingNumberOptimal {
    public static void main(String[] args) {
        int[] nums={3,1,2};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                flag=true;
                break;
            }
        }
        if(!flag) return 0;
        int n=nums.length;
        int requiredSum=n*(n+1)/2;
        int currentSum=0;
        for(int i=0;i<n;i++){
            currentSum+=nums[i];
        }
        return currentSum==requiredSum?nums.length:requiredSum-currentSum;
        
    }
}

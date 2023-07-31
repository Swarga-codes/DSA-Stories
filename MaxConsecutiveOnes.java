public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int k=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                k++;
            }
            else{
                max=Math.max(max,k);
                k=0;
            }
        }
        max=Math.max(max,k);
        return max;
    }
}

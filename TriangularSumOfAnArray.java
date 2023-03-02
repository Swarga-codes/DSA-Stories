public class TriangularSumOfAnArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(triangularSum(nums));
    }
    public static int triangularSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] newNums=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            newNums[i]=(nums[i]+nums[i+1])%10;
        }
        return triangularSum(newNums);

    }
}

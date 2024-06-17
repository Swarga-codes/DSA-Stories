public class SumOfSquaresOfSpecialElements {
    public static void main(String[] args) {
        int[] nums={3,2,1,4};
        System.out.println(sumOfSquares(nums));
    }
    public static int sumOfSquares(int[] nums) {
        int sum=0,n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(n%(i+1)==0){
                sum+=nums[i]*nums[i];
            }
        }
        return sum;
    }
}

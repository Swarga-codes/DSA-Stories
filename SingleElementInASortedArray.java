public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
            return nums[i];
        }
          
       }
       return 0;
    }
}

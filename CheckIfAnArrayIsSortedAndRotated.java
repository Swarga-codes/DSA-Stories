public class CheckIfAnArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums) {
        boolean flag=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                flag=false;
                break;
            }
        }
        if(flag) return true;
       int j=pivot(nums);
       while(j<nums.length){
           if(nums[j]>nums[0] || ((j+1)<nums.length && nums[j]>nums[j+1])){
           return false;
           }
           j++;
       }
       return true;
    }
    public static int pivot(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
             return i+1;
            }
        }
        return -1;
    }
}

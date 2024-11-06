public class FindIfArrayCanBeSorted {
public static void main(String[] args) {
    int[] nums={8,4,2,30,15};
    System.out.println(canSortArray(nums));
}
    public static boolean canSortArray(int[] nums) {
        boolean isSorted=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    if(Integer.bitCount(nums[j])==Integer.bitCount(nums[j+1])){
                        swap(nums,j,j+1);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
}
public static void swap(int[] nums,int i,int j){
    int tmp=nums[i];
    nums[i]=nums[j];
    nums[j]=tmp;
}
}
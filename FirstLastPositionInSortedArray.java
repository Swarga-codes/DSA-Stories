import java.util.Arrays;

public class FirstLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] nums={2,3,6,6,9};
        System.out.println(Arrays.toString(searchRange(nums,6)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        int i,j;
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        if(nums.length==1 && nums[0]==target){
            return new int[]{0,0};
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
               
                res[0]=i;
                break;
            }
        }
        for(j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                res[1]=j;
                break;
            }
        }
        if(i==j){
            return new int[]{i,i};
        }
        if(res[0]==0 && res[1]==0){
            return new int[]{-1,-1};
        }
        return res;
    }
}

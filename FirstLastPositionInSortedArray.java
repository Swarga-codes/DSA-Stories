import java.util.Arrays;

public class FirstLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] nums={2,3,6,6,9};
        System.out.println(Arrays.toString(searchRange(nums,6)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]==target && nums[j]==target){
                return new int[]{i,j};
            }
            else if(nums[i]!=target){
                i++;
            }
            else {
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}

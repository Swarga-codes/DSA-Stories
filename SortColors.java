import java.util.Arrays;

public class SortColors{
    public static void main(String[] args) {
        int[]nums={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        //Dutch National Flag Algorithm 
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void swap(int[] nums,int idx1,int idx2){
        int tmp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=tmp;
    }
}
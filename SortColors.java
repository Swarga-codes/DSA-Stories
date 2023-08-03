import java.util.Arrays;

public class SortColors{
    public static void main(String[] args) {
        int[]nums={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int k=0,red=0,white=0,blue=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                red++;
            }
            else if(nums[i]==1){
                white++;
            }
            else{
                blue++;
            }
        }
        while(red!=0){
            nums[k++]=0;
            red--;
        }
        while(white!=0){
            nums[k++]=1;
            white--;
        }
        while(blue!=0){
            nums[k++]=2;
            blue--;
        }
    }
}
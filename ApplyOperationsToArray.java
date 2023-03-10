import java.util.Arrays;

public class ApplyOperationsToArray {
    public static void main(String[] args) {
        int[] arr={1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(arr)));
    }
    public static int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
            else{
                continue;
            }
        }
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }
}

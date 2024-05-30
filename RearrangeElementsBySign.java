import java.util.Arrays;

public class RearrangeElementsBySign {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int positiveIndex=0,negativeIndex=1;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[positiveIndex]=nums[i];
                positiveIndex+=2;
            }
            else{
                res[negativeIndex]=nums[i];
                negativeIndex+=2;
            }
        }
        return res;
    }
}

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        	int[] nums={1,2,3,4};
	System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int prev[]=new int[nums.length];
        int next[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                prev[i]=1;
            }
            else{
                prev[i]=prev[i-1]*nums[i-1];
            }
        }
          for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                next[i]=1;
            }
            else{
                next[i]=next[i+1]*nums[i+1];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=prev[i]*next[i];
        }
        return nums;
    }
}

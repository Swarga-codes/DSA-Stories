import java.util.Arrays;
import java.util.HashMap;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
     public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortNums=Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(sortNums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=nums.length-1;i>=0;i--){
            map.put(sortNums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=map.get(nums[i]);
        }
        return nums;
    }
}

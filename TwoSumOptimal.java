import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimal {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target= 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
     public static int[] twoSum(int[] nums, int target) {
              HashMap<Integer,Integer> map=new HashMap<>();
              for(int k=0;k<nums.length;k++){
                  if(!map.containsKey(target-nums[k])){
                  map.put(nums[k],k);
                  }
                  else{
                      return new int[]{map.get(target-nums[k]),k};
                  }
              }
             
    
        return new int[]{-1,-1};
    }
}

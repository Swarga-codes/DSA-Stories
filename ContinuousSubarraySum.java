import java.util.*;
public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] nums={23,2,6,4,7};
        int k=6;
        System.out.println(checkSubarraySum(nums, k));
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        int sumModulo=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sumModulo=(sumModulo+nums[i])%k;
            if(map.containsKey(sumModulo)){
                if(i-map.get(sumModulo)>=2){
                    return true;
                }
            }
            else{
                map.put(sumModulo,i);
            }
        }
        return false;
    }
}

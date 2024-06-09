import java.util.HashMap;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        int[] nums={4,5,0,-2,-3,1};
        int k=5;
        System.out.println(subarraysDivByK(nums, k));
    }
    public static int subarraysDivByK(int[] nums, int k) {
        int counter=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixSum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum=(prefixSum+nums[i])%k;
            if(prefixSum<0) prefixSum+=k;
            if(map.containsKey(prefixSum)){
                counter+=map.get(prefixSum);
            }
                map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
            
        }
        return counter;
    }
}

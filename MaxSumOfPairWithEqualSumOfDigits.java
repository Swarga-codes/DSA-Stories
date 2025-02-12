import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxSumOfPairWithEqualSumOfDigits {
    public static void main(String[] args) {
        int[] nums={18,43,36,13,7};
        System.out.println(maximumSum(nums));
    }
      public static int maximumSum(int[] nums) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        Arrays.sort(nums);
        int[] sum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum[i]=sumOfDigits(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(sum[i])){
                List<Integer> ls=map.get(sum[i]);
                ls.add(nums[i]);
                map.put(sum[i],ls);
            }
            else{
                List<Integer> ls=new ArrayList<>();
                ls.add(nums[i]);
                map.put(sum[i],ls);
            }
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,List<Integer>> en:map.entrySet()){
            if(en.getValue().size()>1){
                List<Integer> res=map.get(en.getKey());
                max=Math.max(max,res.get(res.size()-1)+res.get(res.size()-2));
            }
        }
        if(max==Integer.MIN_VALUE) return -1;
        
        return max;
        
    }
    public static int sumOfDigits(int n){
        if(n<10) return n;
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}

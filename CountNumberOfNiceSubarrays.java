import java.util.HashMap;
import java.util.Map;

public class CountNumberOfNiceSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3;
        System.out.println(numberOfSubarrays(nums, k));
    }
       public static int numberOfSubarrays(int[] nums, int k) {
        int count=0,ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
           if(nums[i]%2!=0){
            count++;
           }
            if(map.containsKey(count-k)){
                ans+=map.get(count-k);
            }
            map.put(count,map.getOrDefault(count,0)+1);
        }
        return ans;
    }
}

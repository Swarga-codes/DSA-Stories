import java.util.HashMap;
import java.util.Map;

public class CountNumberOFBadPairs {
    public static void main(String[] args) {
        int[] nums={4,1,3,3};
        System.out.println(countBadPairs(nums));
    }
    public static long countBadPairs(int[] nums) {
        long badCount=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int goodCount=mp.getOrDefault(i-nums[i],0);
            badCount+=i-goodCount;
            mp.put(i-nums[i],goodCount+1);
        }
        return badCount;
    }
}

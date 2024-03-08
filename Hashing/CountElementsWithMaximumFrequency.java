package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,2};
        System.out.println(maxFrequencyElements(nums));
    }
     public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
            map.put(nums[i],1);
            }
        }
        int max=Integer.MIN_VALUE;
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(max<map.get(entry.getKey())){
                max=map.get(entry.getKey());
                count=max;
            }
            else if(max==map.get(entry.getKey())){
                count+=max;
            }
        }
        return count;
    }
}

package Hashing;

import java.util.HashMap;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums={2,2,3,2};
        System.out.println(singleNumber(nums));
    }
      public static int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
    }
    for(Integer key:map.keySet()){
        if(map.get(key)==1){
            return key;
        }
    }
    return -1;
    }
}

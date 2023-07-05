package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber3 {
    public static void main(String[] args) {
        int[] nums={1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
     public static int[] singleNumber(int[] nums) {
            HashMap<Integer,Integer> map=new HashMap<>();
            int k=0;
            int[] res=new int[2];
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
        res[k++]=key;
        }
    }
    return res;
    }
}

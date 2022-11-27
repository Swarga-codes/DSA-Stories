package Hashing;
import java.util.*;
/**
 * MajorityElement
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums={1,3,2,5,1,3,1,5,1};
		HashMap<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<nums.length;i++){
		    if(map.containsKey(nums[i])){
		      
		         map.put(nums[i],map.get(nums[i])+1);
		    }
		    else{
		       
		        map.put(nums[i],1);
		    }
		   
		}
		for(int key:map.keySet()){
		    if(map.get(key)>nums.length/3){
		        System.out.println(key);
		    }
	}
    }
}
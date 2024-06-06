import java.util.*;
public class FourSum {
    public static void main(String[] args) {
      int[] nums={1,0,-1,0,-2,2};
      int target=0;
      System.out.println(fourSum(nums, target)); 
      
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                     HashSet<Long> numSet=new HashSet<>();
                for(int k=j+1;k<nums.length;k++){
                        long sum=(long)nums[i]+nums[j]+nums[k];
                        long req=(long)target-sum;
                        if(numSet.contains(req)){
                            List<Integer> list=new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add((int)req);
                            Collections.sort(list);
                            if(!set.contains(list)){
                                ans.add(list);
                                set.add(list);
                            }
                        }
                        numSet.add((long)nums[k]);
                        
                    
                }
            }
        }
        return ans;
    }
}

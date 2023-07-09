import java.util.HashSet;

public class SumOfDistinctSubarraysWithLengthK {
    public static void main(String[] args) {
        int[] nums={1,5,4,2,9,9,9};
        int k=3;
        System.out.println(maximumSubarraySum(nums,k));
    }
     public static long maximumSubarraySum(int[] nums, int k) {
        long max=Integer.MIN_VALUE;
        long s=0;
         HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<k;i++){
            s+=nums[i];
            set.add(nums[i]);
        }
        if(set.size()==k){
        max=s;
        }
        
        for(int i=1;i<nums.length-k+1;i++){
            s=s-nums[i-1];   
            s=s+nums[i+k-1];
                  int j=i;
                  boolean flag=false;
                  while(j<i+k && set.size()<k){
                      if(nums[i-1]==nums[j]){
                          flag=true;
                          break;
                      }
                      else{
                         j++;
                      }
                  }
                  if(!flag){set.remove(nums[i-1]);}
                set.add(nums[i+k-1]);
            if(set.size()==k){
            if(max<s){
                max=s;
            }
            }
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}

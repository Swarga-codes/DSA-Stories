import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
public static void main(String[] args) {
    int[] nums={-1,0,1,2,-1,-4};
    System.out.println(threeSum(nums));
}
 public static List<List<Integer>> threeSum(int[] nums) {
          List<List<Integer>> res=new ArrayList<>();
         Arrays.sort(nums);
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            j=i+1;
            k=nums.length-1;
          while(j<k){
              int s=nums[i]+nums[j]+nums[k];
              if(s==0){
                  List<Integer> list=new ArrayList<>();
                  list.add(nums[i]);
                    list.add(nums[j]);
                      list.add(nums[k]);
                  res.add(list);
                  j++;
                  k--;
                    while(j<k && nums[j]==nums[j-1]){
                      j++;
                  }
                    while(k>j && nums[k]==nums[k+1]){
                      k--;
                  }
              }
              else if(s>0){
                  k--;
              }
              else{
                  j++;
              }
          }
        }
        return res;
    }
}

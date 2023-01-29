import java.util.*;
public class TargetIndicesAfterSorting {
    public static void main(String[] args) {
        int[] nums={2,3,9,3,5};
        System.out.println(targetIndices(nums,3));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
         Arrays.sort(nums);
         for(int i=0;i<nums.length;i++){
             if(nums[i]==target){
                 list.add(i);
             }
         }
         return list;
     }
}

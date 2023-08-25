import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
     public static int removeDuplicates(int[] nums) {
        if(nums.length<3) return nums.length;
        List<Integer> list=new ArrayList<>();
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                if(count<2){
                  count++;
                list.add(nums[i]);
                }
            }
            else{
              count=1;
              list.add(nums[i-1]);
            }
        }
        list.add(nums[nums.length-1]);
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationII {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(permuteUnique(nums));
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> res=new ArrayList<>();
        List<Integer> storeEach=new ArrayList<>();
        boolean[] isChecked=new boolean[nums.length];
        recursivePermute(nums,storeEach,res,isChecked);
          HashSet<List<Integer>> hashSet = new HashSet<>(res);
    res=new ArrayList<>(hashSet);
        return res;
    }
        public static void recursivePermute(int[] nums,List<Integer> storeEach,List<List<Integer>> res,boolean[] isChecked){
        if(storeEach.size()==nums.length){
            res.add(new ArrayList<>(storeEach));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!isChecked[i]){
                isChecked[i]=true;
                storeEach.add(nums[i]);
                recursivePermute(nums,storeEach,res,isChecked);
                storeEach.remove(storeEach.size()-1);
                isChecked[i]=false;
            }
        }
    }
}

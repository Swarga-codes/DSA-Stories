import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }
      public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        solve(nums,0,new ArrayList<>(),res);
        return res;
    }
    public static void solve(int[] nums,int i,List<Integer> ls,List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[i]);
        solve(nums,i+1,ls,res);
        ls.remove(ls.size()-1);
        solve(nums,i+1,ls,res);
    }
}

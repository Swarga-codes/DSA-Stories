import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,new ArrayList<>(),res);
        return res;
    }
    public static void solve(int[] nums,int i,List<Integer> ls,List<List<Integer>> res){
         res.add(new ArrayList<>(ls));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]){
                continue;
            }
            ls.add(nums[j]);
            solve(nums,j+1,ls,res);
            ls.remove(ls.size()-1);
        }
    }
}

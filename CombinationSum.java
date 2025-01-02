import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
       int[] candidates={2,3,6,7};
       int target=7; 
       System.out.println(combinationSum(candidates, target));
    }
      public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        solve(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
    public static void solve(int[] candidates,int target,int i,List<Integer> ls,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(ls));
            return;
        }
        if(target<0 || i==candidates.length){
            return;
        }
        ls.add(candidates[i]);
        solve(candidates,target-candidates[i],i,ls,res);
        ls.remove(ls.size()-1);
        solve(candidates,target,i+1,ls,res);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(candidates, target));
    }
     public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> res=new ArrayList<>();
         Arrays.sort(candidates);
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
        for(int j=i;j<candidates.length;j++){
        if(j>i && candidates[j]==candidates[j-1]){
            continue;
        }
        if(candidates[j]>target) break;
        ls.add(candidates[j]);
        solve(candidates,target-candidates[j],j+1,ls,res);
        ls.remove(ls.size()-1);
        }
    }
}

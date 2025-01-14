import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        int k=3,n=7;
        System.out.println(combinationSum3(k, n));
    }
      public static List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> arr=Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<List<Integer>> res=new ArrayList<>();
        solve(arr,k,n,0,new ArrayList<>(),res);
        return res;
    }
    public static void solve(List<Integer> arr,int k,int n,int i,List<Integer> ls,List<List<Integer>> res){
        if(k==ls.size() && n==0){
            res.add(new ArrayList<>(ls));
            return;
        }
        if(i==arr.size()){
            return;
        }
        ls.add(arr.get(i));
        solve(arr,k,n-arr.get(i),i+1,ls,res);
        ls.remove(ls.size()-1);
        solve(arr,k,n,i+1,ls,res);
    }
}

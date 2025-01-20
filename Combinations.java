import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n=4,k=2;
        System.out.println(combine(n, k));
    }
       public static List<List<Integer>> combine(int n, int k) {
        List<Integer> ls=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ls.add(i);
        }
        solve(k,ls,0,new ArrayList<>(),res);
        return res;
    }
    public static void solve(int k,List<Integer> ls,int i,List<Integer> ds,List<List<Integer>> res){
        if(ds.size()==k){
            res.add(new ArrayList<>(ds));
            return;
        }
        if(i==ls.size()) return;
        ds.add(ls.get(i));
        solve(k,ls,i+1,ds,res);
        ds.remove(ds.size()-1);
        solve(k,ls,i+1,ds,res);
    }
}

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
        int n=3,k=2;
        System.out.println(getPermutation(n, k));
    }
      public static String getPermutation(int n, int k) {
        List<Integer> ls=new ArrayList<>();
        boolean[] check=new boolean[n];
        for(int i=1;i<=n;i++){
            ls.add(i);
        }
        List<List<Integer>> res=new ArrayList<>();
        solve(0,ls,res,new ArrayList<>(),k,n,check);
        String result="";
        if(k==1)
        {
           for(int i=0;i<ls.size();i++){
            result+=ls.get(i);
           } 
           return result;
        }
        for(int i=0;i<res.get(k-1).size();i++){
            result+=res.get(k-1).get(i);
        }
        return result;
    }
    public static void solve(int i,List<Integer> ls,List<List<Integer>> res,List<Integer> ds,int k,int n,boolean[] check){
        if(i==n){
            // if(k==i+1){
                res.add(new ArrayList<>(ds));
            // }
            return;
        }
        for(int j=0;j<n;j++){
            if(check[j]==false){
                check[j]=true;
                ds.add(ls.get(j));
                if(k==1) return;
                solve(i+1,ls,res,ds,k,n,check);
                ds.remove(ds.size()-1);
                check[j]=false;
            }
        }
    }
}

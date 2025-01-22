import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimePairsWithTargetSum {

    public static void main(String[] args) {
        int n=10;
        System.out.println(findPrimePairs(n));
    }
     public static List<List<Integer>> findPrimePairs(int n) {
        List<Integer> numbers=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        boolean[] checked=new boolean[n];
        for(int i=2;i<n;i++){
            checked[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(checked[i]==true){
                for(int j=i*i;j<n;j+=i){
                    checked[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(checked[i]==true){
                numbers.add(i);
            }
        }
        int x=0,y=numbers.size()-1;
        while(x<=y){
            if(numbers.get(x)+numbers.get(y)==n){
                res.add(new ArrayList<>(Arrays.asList(numbers.get(x),numbers.get(y))));
                x++;
                y--;
            }
            else if(numbers.get(x)+numbers.get(y)>n){
                y--;
            }
            else{
                x++;
            }
        }
        return res;
    }
}
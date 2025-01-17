import java.util.ArrayList;

public class SubsetSums {
    public static void main(String[] args) {
        int[] arr={1,2};
        System.out.println(subsetSums(arr));
    }
     public static ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        solve(arr,0,res,0);
        return res;
    }
    public static void solve(int[] arr,int i,ArrayList<Integer> res,int sum){
        if(i==arr.length){
            res.add(sum);
            return;
        }
        sum+=arr[i];
        solve(arr,i+1,res,sum);
        sum-=arr[i];
        solve(arr,i+1,res,sum);
    }
}

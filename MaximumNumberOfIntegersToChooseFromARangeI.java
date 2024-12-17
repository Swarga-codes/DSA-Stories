import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfIntegersToChooseFromARangeI {
    public static void main(String[] args) {
        int[] banned={1,6,5};
        int n=5,maxSum=6;
        System.out.println(maxCount(banned, n, maxSum));
    }
    public static int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            set.add(banned[i]);
        }
        int sum=0,res=0;
        for(int i=1;i<=n;i++){
            if(sum+i<=maxSum && !set.contains(i)){
                sum+=i;
                res++;
            }
            else if(sum+i>maxSum){
                break;
            }
        }
        return res;
    }
}

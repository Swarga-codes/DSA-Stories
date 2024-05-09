import java.util.Arrays;

public class MaximizeHappinessOfSelectedChildren {
    public static void main(String[] args) {
        int[] happiness={1,2,3};
        int k=2;
        System.out.println(maximumHappinessSum(happiness, k));
    }
 public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length-1;
        long res=0;
         res+=happiness[n--];
       for(int i=2;i<=k;i++){
            if((happiness[n]-i)<0){
                return res;
            }
            else{
                happiness[n]-=i-1;
                res+=happiness[n];
                n--;
            }
        
       }
       return res;
    }
    
}
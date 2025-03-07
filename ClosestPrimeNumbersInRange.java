import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestPrimeNumbersInRange {
    public static void main(String[] args) {
        int left=10,right=19;
        System.out.println(Arrays.toString(closestPrimes(left, right)));
    }
     public static int[] closestPrimes(int left, int right) {
        boolean[] isPrime=new boolean[right+1];
        List<Integer> ls=new ArrayList<>();
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<isPrime.length;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<=right;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=right;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=left;i<=right;i++){
            if(isPrime[i]){
                ls.add(i);
            }
        }
        if(ls.size()<2) return new int[]{-1,-1};
        int min=ls.get(0),max=ls.get(1),diff=max-min;
        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i+1)-ls.get(i)<diff){
                min=ls.get(i);
                max=ls.get(i+1);
                diff=max-min;
            }
        }
        return new int[]{min,max};

    }
}

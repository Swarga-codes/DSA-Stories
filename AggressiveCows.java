import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int n=5,k=3;
        int[] stalls={1,2,4,8,9};
        System.out.println(solve(n, k, stalls));
    }
     public static int solve(int n, int k, int[] stalls) {
      Arrays.sort(stalls);
      int mid, low=1,high=stalls[n-1];
      while(low<=high){
          mid=(low+high)/2;
          if(isPossible(stalls,mid,k)){
              low=mid+1;
          }
          else{
              high=mid-1;
          }
      }
      return high;
    }
    public static boolean isPossible(int[] stalls,int possible,int k){
        int counter=1;
        int start=stalls[0];
        for(int i=0;i<stalls.length;i++){
            if(stalls[i]-start>=possible){
                counter++;
                start=stalls[i];
            }
            if(counter==k){
                return true;
            }
        }
        return counter==k;
    }
}

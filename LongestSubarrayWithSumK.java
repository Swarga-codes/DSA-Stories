import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] A={3,1,2,4};
        int K=4;
        System.out.println(lenOfLongSubarr(A, A.length, K));
    }
     public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int longest=0,sum=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K){
                longest=i+1;
            }
            else if(map.containsKey(sum-K)){
                longest=Math.max(longest,i-map.get(sum-K));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return longest;
    }
}

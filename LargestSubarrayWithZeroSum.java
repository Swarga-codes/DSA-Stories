import java.util.*;
public class LargestSubarrayWithZeroSum {
    public static void main(String[] args) {
       int[] arr={15,-2,2,-8,1,7,10,23};
       int n=arr.length;
       System.out.println(maxLen(arr, n)); 
    }
    public static int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                max=i+1;
            }
            else{
                if(map.containsKey(sum)){
                    max=Math.max(max,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return max;
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class AllocateBooks {
    public static void main(String[] args) {
        int n=4,m=2;
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(12, 34, 67, 90));
        System.out.println(findPages(arr, n, m));

    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n){
            return -1;
        }
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<arr.size();i++){
            max=Math.max(max, arr.get(i));
            sum+=arr.get(i);
        }
        int low=max,high=sum,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(isPossible(arr, mid, m)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static boolean isPossible(ArrayList<Integer> arr,int possible,int m){
        int sum=0,student=1;
        for(int i=0;i<arr.size();i++){
            if(sum+arr.get(i)<=possible){
                sum+=arr.get(i);
            }
            else{
                student++;
                sum=arr.get(i);
            }
        }
        return student>m;
    }
}

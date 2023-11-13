import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTriangleForGivenArray {
    public static void main(String[] args) {
        long[] arr={4, 7, 3, 6, 7};
        long n=arr.length;
        System.out.println(Arrays.toString(getTriangle(arr, n)));
    }
     public static long[] getTriangle(long arr[], long n)
    {
        List<Long> li=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           li.add(arr[i]);
       }
       getValues(arr,n,li);
       long[] res=new long[li.size()];
       for(int i=0;i<li.size();i++){
           res[i]=li.get(i);
       }
       return res;
        
    }
    public static void getValues(long[] arr,long n,List<Long> li){
         if(n<1) return;
        long[] newArr=new long[(int)(n-1)];
        for(int i=0;i<n-1;i++){
            newArr[i]=arr[i]+arr[i+1];
        }
        
        for(int i=newArr.length-1;i>=0;i--){
            li.add(0,newArr[i]);
        }
        getValues(newArr,n-1,li);
        
    }
}

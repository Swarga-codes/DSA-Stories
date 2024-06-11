import java.util.*;
public class CountInversions {
    public static void main(String[] args) {
        long[] arr={2,3,1,4,5};
        long N=arr.length;
        System.out.println(inversionCount(arr,N));
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
       
        return mergeSort(arr,0,(int)N-1);
    }
    static long merge(long arr[], int l, int m, int r)
    {
         // Your code here
         int left=l;
         int right=m+1;
         long count=0;
         ArrayList<Long> list=new ArrayList<>();
         while(left<=m && right<=r){
             if(arr[left]<=arr[right]){
                 list.add(arr[left]);
                 left++;
             }
             else{
                 list.add(arr[right]);
                 right++;
                 count+=(m-left+1);
             }
         
         }
         while(left<=m){
             list.add(arr[left++]);
         }
         while(right<=r){
             list.add(arr[right++]);
         }
         for(int i=l;i<=r;i++){
             arr[i]=list.get(i-l);
         }
         return count;
        
    }
   static long mergeSort(long arr[], int l, int r)
    {
        long count=0;
        if(l>=r) return count;
        int mid=(l+r)/2;
        count+=mergeSort(arr,l,mid);
        count+=mergeSort(arr,mid+1,r);
      count+=merge(arr,l,mid,r);
      return count;
    }
}

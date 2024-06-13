import java.util.Arrays;

public class CeilingInASortedArray {
    public static void main(String[] args) {
        int[] a={3, 4, 7, 8, 8, 10};
        int n=a.length;
        int x=8;
        System.out.println(Arrays.toString(getFloorAndCeil(a, n, x)));
    }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int low=0,high=n-1,mid;
        int ceil=Integer.MAX_VALUE,floor=-1;
        while(low<=high){
          mid=(low+high)/2;
          if(a[mid]==x){
            return new int[]{x,x};
          }
          else if(a[mid]<x){
            if(a[mid]>floor){
              floor=a[mid];
            }
            low=mid+1;
          }
          else {
            if(a[mid]<ceil){
              ceil=a[mid];
            }
            high=mid-1;
          }
        }
        if(ceil==Integer.MAX_VALUE){
          ceil=-1;
        }
        return new int[]{floor,ceil};
      }
}

import java.util.*;
public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr={2,2};
        int n=arr.length;
        System.out.println(Arrays.toString(findTwoElement(arr, n)));
    }
    public static int[] findTwoElement(int arr[], int n) {
        int[] res=new int[2];
          Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                res[0]=arr[i];
            }
           set.add(arr[i]);
           
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)) {
                res[1]=i;
                break;
            }
        }
        return res;
    }
}

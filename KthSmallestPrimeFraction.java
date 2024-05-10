import java.util.*;
public class KthSmallestPrimeFraction {
    public static void main(String[] args) {
        int[] arr={1,2,5,3};
        int k=2;
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, k)));
    }
       public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                List<Integer> fraction=new ArrayList<>();
                if(i<j && arr[i]<arr[j]){
                    fraction.add(arr[i]);
                    fraction.add(arr[j]);
                    list.add(fraction);
                }
            }
        }
        list.sort((a,b)->Double.compare((double) a.get(0) / a.get(1), (double) b.get(0) / b.get(1)));
        int[] res=new int[2];
        res[0]=list.get(k-1).get(0);
        res[1]=list.get(k-1).get(1);
        return res;
    }
}

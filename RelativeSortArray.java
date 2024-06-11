import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19},arr2={2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
    }
        int k=0;
        for(int i=0;i<arr2.length;i++){
            int el=arr2[i];
            int j=map.get(arr2[i]);
            while(j>0){
                arr1[k++]=el;
                j--;
            }
            map.put(el,0);
        }
        int tmp=k;
        for(Map.Entry<Integer,Integer> ele:map.entrySet())
        {
            int j=ele.getValue();
            while(j>0){
                arr1[k++]=ele.getKey();;
                j--;
            }
        }
        Arrays.sort(arr1,tmp,arr1.length);
        return arr1;
    }
}

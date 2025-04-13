import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        Integer[] arr={1,3,1,1,1,5,2,7};
        System.out.println(totalElements(arr));
    }
    public static int totalElements(Integer[] arr) {
        // code here
        int max=0;
       int l=0,r=0;
       Map<Integer,Integer> mp=new HashMap<>();
        while(r<arr.length){
            mp.put(arr[r],mp.getOrDefault(arr[r],0)+1);
            while(mp.size()>2){
                //do something
               mp.put(arr[l],mp.get(arr[l])-1);
               if(mp.get(arr[l])==0){
                   mp.remove(arr[l]);
               }
               l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
       return max;
    }
}

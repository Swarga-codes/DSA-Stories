
import java.util.*;
public class RankTransformOfArray {
    public static void main(String[] args) {
        int[] arr={40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] tmp=new int[arr.length];
 
   for(int i=0;i<arr.length;i++){
        tmp[i]=arr[i];
   }
        Arrays.sort(tmp);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(tmp[i],map.size()+1);
        }
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }

   
}

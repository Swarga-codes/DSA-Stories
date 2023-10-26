import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }
     public static int[][] kClosest(int[][] points, int k) {
        HashMap<Integer[],Integer> map=new HashMap<>();
        for(int i=0;i<points.length;i++){
            Integer[] intArr=new Integer[2];
            intArr[0]=points[i][0];
            intArr[1]=points[i][1];
            map.put(intArr,(int)(Math.pow(points[i][0],2)+Math.pow(points[i][1],2)));
        }
        List<Integer[]> list=new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(a)-map.get(b));
        int[][] res=new int[k][2];
       for(int i=0;i<k;i++){
           res[i][0]=list.get(i)[0];
           res[i][1]=list.get(i)[1];
       }
        return res;
    }
}

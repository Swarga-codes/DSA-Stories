import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"}; int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
    String[] ans=new String[names.length];
    for(int i=0;i<names.length;i++){
        ans[names.length-i-1]=map.get(heights[i]);
    }
    return ans;
    }
}

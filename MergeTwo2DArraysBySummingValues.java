import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwo2DArraysBySummingValues {

    public static void main(String[] args) {
        int[][] nums1={{1,3},{2,3}},nums2={{2,4},{4,4}};
        System.out.println(Arrays.deepToString(mergeArrays(nums1, nums2)));
    }
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0,j=0;
        List<List<Integer>> res=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]==nums2[j][0]){
                 int sum=0;
                sum+=nums1[i][1]+nums2[j][1];
                res.add(Arrays.asList(nums1[i][0],sum));
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                res.add(Arrays.asList(nums1[i][0],nums1[i][1]));
                i++;
            }
            else{
                res.add(Arrays.asList(nums2[j][0],nums2[j][1]));
                j++;
            }
        }
        while(i<nums1.length){
            res.add(Arrays.asList(nums1[i][0],nums1[i][1]));
                i++;
        }
        while(j<nums2.length){
                res.add(Arrays.asList(nums2[j][0],nums2[j][1]));
                j++;
        }
        int[][] resArr=new int[res.size()][2];
        for(int k=0;k<resArr.length;k++){
            resArr[k][0]=res.get(k).get(0);
            resArr[k][1]=res.get(k).get(1);
        }
        return resArr;
    }
}
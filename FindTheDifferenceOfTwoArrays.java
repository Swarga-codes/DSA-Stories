import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3}, nums2 = {2,4,6};
System.out.println(findDifference(nums1, nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            s1.add(nums1[i]);
        }
          for(int i=0;i<nums2.length;i++){
            s2.add(nums2[i]);
        } 
        Set<Integer> diff1=new HashSet<>(s1);
        Set<Integer> diff2=new HashSet<>(s2);
        diff1.removeAll(s2);
        diff2.removeAll(s1);
    for(int i:diff1){
        l1.add(i);
    }
     for(int i:diff2){
        l2.add(i);
    }
    res.add(l1);
    res.add(l2);
        return res;
    }
}

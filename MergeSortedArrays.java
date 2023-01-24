import java.util.*;
public class MergeSortedArrays {
public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0};
    int m = 3, n = 3;
    int[] nums2 = {2,5,6};
    merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));
}
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
    
      for(j=0;j<n;j++){
          nums1[m+j]=nums2[j];
      }
   Arrays.sort(nums1);
    }
}

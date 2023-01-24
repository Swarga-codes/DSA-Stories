public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,3,5};
        int[] arr2={4};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
       
        int[] merge=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                merge[k]=nums1[i];
                i++;
                k++;
            }
            else if(nums1[i]>nums2[j]){
                merge[k]=nums2[j];
                j++;
                k++;
            }
            else{
                merge[k]=nums1[i];
                i++;
                k++;
                merge[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            merge[k]=nums1[i];
            i++;
            k++;
        }
         while(j<nums2.length){
            merge[k]=nums2[j];
            j++;
            k++;
        }

        if(merge.length%2==0){
            return (double)(((double)merge[merge.length/2]+(double)merge[(merge.length/2)-1])/2);
        }
        else{
            return (double)merge[merge.length/2];
        }
    }
}

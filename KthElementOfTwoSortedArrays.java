public class KthElementOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9},arr2[] = {1, 4, 8, 10};
        int k=5;
        System.out.println(kthElement(arr1, arr2, k, k, k));
    }
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int i=0,j=0,l=0;
        int[] mix=new int[k];
        while(i<n && j<m && l<k){
            if(arr1[i]<=arr2[j]){
                mix[l++]=arr1[i++];
            }
            else{
                mix[l++]=arr2[j++];
            }
        }
        while(i<n && l<k){
            mix[l++]=arr1[i++];
        }
        while(j<m && l<k){
            mix[l++]=arr2[j++];
        }
        return mix[k-1];
    }
}

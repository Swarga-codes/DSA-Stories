public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(arr, k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int l=0,h=arr.length-1,mid;
        while(l<=h){
            mid=(l+h)/2;
            int miss=arr[mid]-(mid+1);
            if(miss<k){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return h+1+k;
    }
}

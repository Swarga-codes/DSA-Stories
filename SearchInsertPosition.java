public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(arr, target));
    }
    public static int searchInsert(int[] arr, int target) {
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                h=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return l;
    }
}

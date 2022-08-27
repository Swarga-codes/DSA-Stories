public class BinaryRecursion {
    public static void main(String[] args) {
        int[] arr={1,3,5,9,15};
        int target=5;
      System.out.println(BinarySearchRecurse(arr, target, 0, arr.length-1));  
    }
    static int BinarySearchRecurse(int[] arr,int target,int start,int end){
    int mid=start+(end-start)/2;
    if(start<=end){
        if(arr[mid]==target){
        return mid;
        }
        else if(target>arr[mid]){
           return BinarySearchRecurse(arr, target, mid+1, end);
        }
        else{
            return BinarySearchRecurse(arr, target, start, mid-1);
        }
    }
    return -1;
    }
}

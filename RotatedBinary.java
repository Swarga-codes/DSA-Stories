public class RotatedBinary {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
     
        System.out.println(findElement(arr,2));
    }
    static int findElement(int[] arr,int target){
        int pivot=findPivot(arr, 0, arr.length-1);
        int firstHalf=BinarySearch(arr, target, 0, pivot);
        int secondHalf=BinarySearch(arr, target, pivot+1, arr.length-1);
        if(firstHalf!=-1){
            return firstHalf;
        }
        else{
            return secondHalf;
        }
    }
    static int findPivot(int[] arr,int start,int end){
        
       if(start<=end){
        int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                return findPivot(arr,start,mid-1);
            }
            else{
               return findPivot(arr, mid+1, end);
            }
        }
        return -1;
    }
    static int BinarySearch(int[] arr,int target, int start,int end){
        if(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                return BinarySearch(arr, target, mid+1, end);
            }
            else{
                return BinarySearch(arr, target, start, mid-1);
            }
        }
        return -1;
    }
}

public class PeakElement {
    public static void main(String[] args) {
        int[] arr={5,10,20,15};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        if(arr.length<3){
            return -1;
        }
   int l=0;
   int h=arr.length-1;
   while(l<=h){
       int mid=l+(h-l)/2;
       if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
           return mid;
       }
       else if(arr[mid]<arr[mid+1] && (mid+1)<arr.length){
           l=mid+1;
       }
       else{
           h=mid-1;
       }
   }
   return -1;
    }
}

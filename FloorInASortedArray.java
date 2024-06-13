public class FloorInASortedArray {
    public static void main(String[] args) {
        long arr[]={1,2,3,4,5,65};
        int n=arr.length;
        long x=5;
        System.out.println(findFloor(arr, n, x));
    }
    static int findFloor(long arr[], int n, long x)
    {
        int low=0,high=n-1;
        int mid,ans=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else {
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
    
}

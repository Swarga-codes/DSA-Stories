import java.util.*;
class BinarySearch{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        System.out.println(BS(arr,target));
        in.close();
    }
    static int BS(int[] arr,int target){
        int start,end;
        start=0;
        end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
         
        }
        return -1;
        
    }
}
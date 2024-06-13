public class CeilTheFloor {
    public static void main(String[] args) {
        int[] arr= {5, 6, 8, 9, 6, 5, 5, 6};
        int n=arr.length;
        int x=7;
        Pair ans=getFloorAndCeil(arr, n, x);
        System.out.println(ans.floor+" "+ans.ceil);
    }
    public static Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        int floor=-1,ceil=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>floor && arr[i]<=x){
                floor=arr[i];
            }
            if(arr[i]<ceil && arr[i]>=x){
                ceil=arr[i];
            }
        }
        if(ceil==Integer.MAX_VALUE){
            ceil=-1;
        }
        return new Pair(floor,ceil);
        
    }
}
class Pair{
    int floor,ceil;
    Pair(int floor,int ceil){
        this.floor=floor;
        this.ceil=ceil;
    }
}

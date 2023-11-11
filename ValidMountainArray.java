public class ValidMountainArray {
    public static void main(String[] args) {
      int[] arr={0,3,2,1};
      System.out.println(validMountainArray(arr));  
    }
    public static boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int i=0;
         while(i<arr.length-1 && arr[i]<arr[i+1]){
             i++;
         }
         if(i==arr.length-1 || i==0) return false;
         return isDecreasing(arr,i);
     }
     public  static boolean isDecreasing(int[] arr,int s){
         while(s<arr.length-1 && arr[s]>arr[s+1]){
             s++;
         }
         return s==arr.length-1;
     }
}

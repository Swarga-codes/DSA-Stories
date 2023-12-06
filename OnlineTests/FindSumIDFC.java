package OnlineTests;

public class FindSumIDFC {
    public static void main(String[] args) {
        int n=4;
        int[] arr={23,56,45,342};
        System.out.println(findSum(n, arr));
      }
      public static int findSum(int n,int[] arr){
          int s=0;
          for(int i=0;i<n;i++){
              s+=minVal(arr[i]);
          }
          return s;
      }
      public static int minVal(int n){
          if(n<10) return n;
          int min=n%10;
          while(n!=0){
              min=Math.min(min,n%10);
              n/=10;
          }
          return min;
      }
}

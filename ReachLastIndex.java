import java.util.Scanner;

public class ReachLastIndex {
      public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        boolean flag=true;
        int i=0;
        while(i<arr.length-1){
            if(arr[i]==0){
                flag=false;
                break;
            }
            else if(arr[i]>=arr.length-1){
                flag=true;
                break;
            }
            else{
                    i+=arr[i];
                }
            }
         System.out.println(flag);
        }
       
}

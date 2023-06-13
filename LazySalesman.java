import java.util.Arrays;
import java.util.Scanner;

public class LazySalesman {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		    int n=in.nextInt();
		    int w=in.nextInt();
		    int[] arr=new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=in.nextInt();
		    }
		    Arrays.sort(arr);
		    int hol=n;
		    int sum=0;
		    for(int k=n-1;k>=0;k--){
		         if(sum>=w){
		           break;
		       }
		       else{
		           sum+=arr[k];
		           hol--;
		       }
		      
		       
		    }
		    System.out.println(hol);
		}
    }
}

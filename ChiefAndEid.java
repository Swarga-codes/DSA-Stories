import java.util.Arrays;
import java.util.Scanner;

public class ChiefAndEid {
    public static void main(String[] args) {
        	Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		    int n=in.nextInt();
		    int[] arr=new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=in.nextInt();
		    }
		   
		    Arrays.sort(arr);
		    int min=Integer.MAX_VALUE;
		   for(int k=0;k<arr.length-1;k++){
		       if(min>(arr[k+1]-arr[k])){
		           min=arr[k+1]-arr[k];
		       }
		   }
		    System.out.println(min);
		}
    }
}

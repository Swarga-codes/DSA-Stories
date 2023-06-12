import java.util.Scanner;

public class BombTheBase {
    public static void main(String[] args) {
        	Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		    int n=in.nextInt();
		    int[] arr=new int[n];
		    int x=in.nextInt();
		    int count=0;
		    for(int j=0;j<n;j++){
		        arr[j]=in.nextInt();
		    }
		    for(int j=arr.length-1;j>=0;j--){
		        if(arr[j]<x){
		           count=j+1;
		           break;
		        }
		    }
		    System.out.println(count);
		}
    }
}

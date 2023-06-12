import java.util.Scanner;

public class MaximumProduct {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
       System.out.println(maxProduct(arr)); 
    }
    public static int maxProduct(int[] arr){
        int max=Integer.MIN_VALUE;
        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod*=arr[i];
            if(max<prod){
                max=prod;
            }
            if(prod==0){
                prod=1;
            }
        }
        return max;
    }
}

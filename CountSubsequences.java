import java.util.*;
public class CountSubsequences {
    static int printSub(int ind, int arr[], int s, int sum){
        if(ind==arr.length){
            if(s==sum){
            return 1;
            }
            else
            return 0;
        }
        else{
            s=s+arr[ind];
            int l=printSub(ind+1, arr,s,sum);
            s=s-arr[ind];
            int r=printSub(ind+1,arr,s,sum);
        return l+r;
     }
    }
     public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    int n=sc.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the sum");
    int sum=sc.nextInt();
    System.out.println("The number of subsequnces formed for the given sum of "+ sum+" is "+printSub(0,arr,0,sum));
}
}

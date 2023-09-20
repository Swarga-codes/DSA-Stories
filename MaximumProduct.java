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
      public static int maxProduct(int[] nums) {
        int prod=nums[0];
        int prefix=1;
        int suffix=1;
        for(int i =0;i<nums.length;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix*=nums[i];
            suffix*=nums[nums.length-i-1];
            
            prod=Math.max(prod,Math.max(prefix,suffix));
        } return prod;
    }
}

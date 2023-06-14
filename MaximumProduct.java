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
        int max=nums[0],min=nums[0],ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(max,max*nums[i]);
            min=Math.min(min,min*nums[i]);
             ans=Math.max(ans,max);
        }
       
        return ans;
    }
}

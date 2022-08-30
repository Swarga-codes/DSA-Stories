//This is also Known as Kadane's Algorithm
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr={9,2,3,-1,2,-5};
        System.out.println(MaxSubSum(arr));
    }
    static int MaxSubSum(int[] arr){
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}

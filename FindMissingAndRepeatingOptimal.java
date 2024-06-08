import java.util.Arrays;

public class FindMissingAndRepeatingOptimal {
    public static void main(String[] args) {
        int[] arr={1, 3, 3};
        int n=arr.length;
        System.out.println(Arrays.toString(findTwoElement(arr, n)));
    }
    public static int[] findTwoElement(int arr[], int n) {
        // code here
        int repeating=0,missing=0;
        long currentSum=0,currentSquaredSum=0,requiredSum=0,requiredSquaredSum=0,sum=0,diff=0;
        for(int i=0;i<n;i++){
            currentSum+=arr[i];
            currentSquaredSum+=(long)arr[i]*arr[i];
        }
        requiredSum=(n*(n+1L))/2;
        requiredSquaredSum=(n*(n+1L)*(2L*n+1))/6;
        diff=currentSum-requiredSum;
        sum=(currentSquaredSum-requiredSquaredSum)/diff;
        repeating=(int)((sum+diff)/2);
        missing=(int)(repeating-diff);
        return new int[]{repeating,missing};
    }
}

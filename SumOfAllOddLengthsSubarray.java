import java.util.*;
public class SumOfAllOddLengthsSubarray {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};

        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr.length;j+=2){
                if(i+j>arr.length){
                    break;
                }
                int[] subarray=Arrays.copyOfRange(arr,i,i+j);
                for(int k=0;k<subarray.length;k++){
                    sum+=subarray[k];
                }
            }
        }
        return sum;
    }
}

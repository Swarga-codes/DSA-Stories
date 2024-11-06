import java.util.Arrays;

public class SortIntegersByTheNumberOfOneBits {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    public static int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(Integer.bitCount(arr[j])==Integer.bitCount(arr[j+1])){
                    if(arr[j]>arr[j+1]){
                        int tmp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                    }
                }
                else if(Integer.bitCount(arr[j])>Integer.bitCount(arr[j+1])){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        return arr;
    }
}
import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr={3,9,4,5,6};
        System.out.println(Arrays.toString(BubbleSorting(arr)));
    }
    static int[] BubbleSorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}

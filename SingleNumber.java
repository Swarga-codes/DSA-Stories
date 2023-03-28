import java.util.*;
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] arr) {
        int k=1,pos=0;
        if(arr.length==1){
            return arr[0];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(i+1==arr.length-1 && arr[i+1]!=arr[i]){
                return arr[i+1];
            }
            if(arr[i]==arr[i+1]){
                k++;
            }
            else
            {
                if(k==1){
                    pos=arr[i];
                }
                else{
                    k=1;
                }
            }
        }
        return pos;
        }
}

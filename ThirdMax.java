import java.util.*;
public class ThirdMax {
    public static void main(String[] args) {
        int[] arr={3,2,9,9,1,4};
        System.out.println(thirdMax(arr));
        }
        static int thirdMax(int[] arr){
            if(arr.length==1){
                return arr[0];
            }
            Arrays.sort(arr);
            int c=1;
            int last=arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--){
                if(arr[i]!=last){
                    c++;
                    last=arr[i];
                }
                if(c==3){
                    return arr[i];
                }
            }
            return arr[arr.length-1];
        }
}

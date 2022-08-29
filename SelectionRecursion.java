import java.util.Arrays;

/**
 * SelectionRecursion
 */
public class SelectionRecursion {

    public static void main(String[] args) {
        int[] arr={9,2,3,1,2};
        System.out.println(Arrays.toString(selection(arr, arr.length, 0,0)));

    }
    static int[] selection(int[] arr,int r,int c,int max){
    if(r==0){
        return arr;
    }
    if(c<r){
        if(arr[max]<arr[c]){
            return selection(arr, r, c+1,c);
        }
        else{
            return selection(arr, r, c+1, max);
        }
        
    }
   
    else{
        int temp=arr[max];
        arr[max]=arr[r-1];
        arr[r-1]=temp;
        return selection(arr, r-1, 0, 0);
    }
    }
}
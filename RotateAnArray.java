import java.util.*;
public class RotateAnArray {
	public static void main(String[] args) {
	int[] arr={1,2,3,9,5,2};
	rotate(arr,3);
	System.out.println(Arrays.toString(arr));
	}
	 public static void rotate(int[] arr, int k) {
        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }
        if(arr.length==2){
            if(k%2==0){
                return;
            }
            else{
                int temp=arr[0];
                arr[0]=arr[1];
                arr[1]=temp;
                return;
            }
        }
        
        int[] tmp=new int[arr.length];
	    int i;
	    if(k>arr.length){
	        k=k-arr.length;
	    }
	    int x=k;
        //appending rotated part of the array to the front
	    for(i=0;i<k;i++){
	       tmp[i]=arr[arr.length-x];
	        x--;
	    }
        //appending the rest of the array
	    for(i=k;i<arr.length;i++){
	        tmp[i]=arr[i-k];
	    }
	    for(i=0;i<arr.length;i++){
	        arr[i]=tmp[i];
	    }
    }
}



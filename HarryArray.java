import java.util.*;
public class HarryArray {
    public static void main(String[] args) {
	    Scanner ob=new Scanner(System.in);
	    int n=ob.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<arr.length;i++){
	        arr[i]=ob.nextInt();
	    }
	
		System.out.println(Arrays.toString(solve(arr)));
        ob.close();
	}
	static int[] solve(int[] arr){
	    if(arr.length%2==1){
	        return new int[]{-1};
	    }
	    Arrays.sort(arr);
	    int[] temp=new int[arr.length/2];
	   for(int i=0;i<temp.length;i++){
	       if(3*arr[i]==arr[i+(arr.length/2)]){
	           temp[i]=arr[i];
	       }
	       else{
	           return new int[]{-1};
	       }
	   }
	  return temp;
	}
}

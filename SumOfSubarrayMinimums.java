import java.util.Stack;

public class SumOfSubarrayMinimums {

    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
     public static int sumSubarrayMins(int[] arr) {
        int MODULO=(int)Math.pow(10,9)+7;
         long res=0;
	   int[] nse=nextSE(arr);
	   int[] pse=prevSE(arr);
	   for(int i=0;i<arr.length;i++){
	       long left=i-pse[i];
	       long right=nse[i]-i;
	       res=(res+(left*right*arr[i])%MODULO)%MODULO;
	   }
       return (int)res;
    }
    public static int[] nextSE(int[] arr){
	     int[] nse=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=arr.length-1;i>=0;i--){
		        while(!st.isEmpty() && arr[i]<arr[st.peek()]){
		            st.pop();
		        }
		        if(st.isEmpty()){
		            nse[i]=arr.length;
		        }
		        else{
		            nse[i]=st.peek();
		        }
		        st.push(i);
		        
		    }
            return nse;
		}
		
	public static int[] prevSE(int[] arr){
	    int[] pse=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++){

		        while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
		            st.pop();
		        }
		        if(st.isEmpty()){
		            pse[i]=-1;
		        }
		        else{
		            pse[i]=st.peek();
		        }
		        st.push(i);
		        
		}
		return pse;
	}
}
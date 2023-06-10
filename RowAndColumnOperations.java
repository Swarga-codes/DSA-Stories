import java.util.Scanner;

public class RowAndColumnOperations {
    	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int q=in.nextInt();
		in.nextLine();
		int[] Rarr=new int[n];
		int[] Carr=new int[n];
		for(int i=0;i<q;i++){
		    String actions=in.nextLine();
		    if(actions.charAt(0)=='R'){
		        RowAdd(Rarr,Integer.parseInt(actions.substring(actions.indexOf(' ')+1,actions.lastIndexOf(' ')))-1,Integer.parseInt(actions.substring(actions.lastIndexOf(' ')+1)));
		    }
		    else{
		        ColAdd(Carr,Integer.parseInt(actions.substring(actions.indexOf(' ')+1,actions.lastIndexOf(' ')))-1,Integer.parseInt(actions.substring(actions.lastIndexOf(' ')+1)));
		    }
		}
		System.out.println(max(Rarr)+max(Carr));
	}
	public static void RowAdd(int[] Rarr,int row,int val){
	  Rarr[row]+=val;
	}
		public static void ColAdd(int[] Carr,int col,int val){
	    
	        Carr[col]+=val;
	    }
	public static int max(int[] arr){
	    if(arr.length==0) return 0;
	    if(arr.length==1) return arr[0];
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<arr.length;i++){
	            if(max<arr[i]){
	                max=arr[i];
	            }
	        }
	    return max;
	}
}

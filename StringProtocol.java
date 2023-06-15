import java.util.Scanner;

public class StringProtocol {
    public static void main(String[] args) {
        	Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		    int k=0;
		    int n=in.nextInt();
		    String s=in.next();
		    int j=0;
		    while(j<s.length()-1){
		        if(s.charAt(j)==s.charAt(j+1)){
		            k++;
		            j=j+2;
		        }
		      else{
		          
		          j++;
		      } 
		    }
		  
		    System.out.println(n-k);
		}
    }
}


import java.util.Scanner;

public class JanmanshAndFruit {
    public static void main(String[] args) {
        	Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		    int n=in.nextInt();
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		   	System.out.println(calc(n,a,b,c)); 
		}
    }
    public static int calc(int n,int a,int b,int c){
	    int min=min(a,b,c);
	    int second=second(a,b,c);
	    return min*(n-1)+second;
	}
	public static int min(int a,int b,int c){
	    if(a<=b && a<=c){
	        return a;
	    }
	    else if(b<=a && b<=c){
	        return b;
	    }
	    return c;
	}
	public static int second(int a,int b, int c){
	    if(a>=b && a<=c || a<=b && a>=c){
	        return a;
	    }
	    else if(b>=a && b<=c || b<=a && b>=c){
	        return b;
	    }
	    
	        return c;
	    
	    
	}
}

import java.util.Scanner;

public class AdaAndCrayons {
    public static void main(String[] args) {
        	Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int j=0;j<t;j++){
		    String s=in.next();
		    int c1=0;
		    int c2=0;
		    for(int i=0;i<s.length()-1;i++){
		        if(s.charAt(i)=='U' && s.charAt(i+1)!='U'){
		            c1++;
		        }
		        else if(s.charAt(i)=='D' && s.charAt(i+1)!='D'){
		            c2++;
		        }
		    }
		    if(s.charAt(s.length()-1)=='D'){
		        c2++;
		    }
		    else{
		        c1++;
		    }
		    System.out.println(Math.min(c1,c2));
		   
	}
    }
}

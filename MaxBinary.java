import java.util.*;

public class MaxBinary {
    public static void main(String[] args) {
        	Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		    int n=in.nextInt();
		    int k=in.nextInt();
		    String s=in.next();
		  
		        if(s.charAt(0)=='0'){
		          s="1"+s.substring(1);
		          k--;
		        }
		      if(k>0){
		        s=addZero(s,k);
		      }
		    System.out.println(s);
		}
        }
          public static String addZero(String s, int k){
            StringBuilder str=new StringBuilder(s);
            for(int i=0;i<k;i++){
                str.append('0');
            }
            return str.toString();
        }
    }


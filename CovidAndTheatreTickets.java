import java.util.Scanner;

public class CovidAndTheatreTickets {
    public static void main(String[] args) {
        	Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		    int n=in.nextInt();
		    int m=in.nextInt();
		 int x,y;
		 if(n%2!=0){
		     x=(n/2)+1;
		 }
		 else{
		     x=n/2;
		 }
		  if(m%2!=0){
		     y=(m/2)+1;
		 }
		 else{
		     y=m/2;
		 }
		  System.out.println(x*y);
		}
    }
}

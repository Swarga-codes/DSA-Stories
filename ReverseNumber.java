import java.util.Scanner;
//Way 1
public class ReverseNumber {
    static int rev=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
       
        
reverse(n);
 System.out.println("The reverse of the number is: "+rev);
 in.close();
    }
    static void reverse(int n){
     
      if(n==0){
        return;
      }
     
    rev=rev*10+n%10;
    reverse(n/10);
     
     
    
    }
}

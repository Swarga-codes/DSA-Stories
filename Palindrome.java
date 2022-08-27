import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n==noOfDigits(n)){
            System.out.println(n+" is a Palindrome number.");
        }
        else{
            System.out.println(n+" is not a Palindrome number.");
        }
        in.close();
    }
    static int noOfDigits(int n){
      int digits=(int)Math.log10(n)+1;
      return reverse(n,digits);
    }
    static int reverse(int n,int digits){
        if(n<10){
            return n;
        }
        return (int)((n%10)*Math.pow(10, digits-1)+reverse(n/10, digits-1));

    }
}

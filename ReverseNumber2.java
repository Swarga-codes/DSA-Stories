import java.util.Scanner;
//Way 2
public class ReverseNumber2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("The reverse of the number is: "+noOfDigits(n));
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

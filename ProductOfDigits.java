import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("The product is: "+product(num));
        in.close();
    }
    static int product(int n){
        int prod=1;
  if(n>=10){
prod*=n%10;
return prod*product(n/10); 
  }
  return n;
    }
}

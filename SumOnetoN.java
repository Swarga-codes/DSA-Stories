import java.util.Scanner;

public class SumOnetoN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("The summation is: "+Sum(n));
        in.close();
    }
    static int Sum(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        return n+Sum(n-1);
    }
}

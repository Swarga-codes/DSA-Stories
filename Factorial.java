import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("The factorial is:"+Facto(n));
        in.close();
    }
    static int Facto(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*Facto(n-1);
    }
}

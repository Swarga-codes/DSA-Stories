import java.util.Scanner;

public class PowerofTwoLeetcode {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isPowerOfTwo(n));
        in.close();
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
    if((n&(n-1))==0 && n>0){
        return true;
    }    
        else{
            return false;
        }
    }
}


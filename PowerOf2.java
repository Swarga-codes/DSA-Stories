import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(PowerOfTwo(n)==true){
            System.out.println(n+" is a power of 2.");
        }
        else{
            System.out.println(n+" is not a power of 2.");
        }
        in.close();
    }
    static boolean PowerOfTwo(int n){
        return (n&(n-1))==0;
    }
}

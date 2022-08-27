import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();    
System.out.println("The result is : "+powers(a, b));
    in.close();
    }
    static int powers(int a,int b){
        if(b==0){
    return 1;
        }
        else if(b==1){
            return a;
        }
        return a*powers(a,b-1);
    }
}

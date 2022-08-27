import java.util.Scanner;

public class CountSteps {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(numberOfSteps(n));
        in.close();
    }
    static int numberOfSteps(int n){
        int k=0;
        while(n>0){
        if(n%2==0){
            n=n/2;
            k++;
        }
        else{
  n=n-1;
  k++;
        }
    }
    return k;
}
}

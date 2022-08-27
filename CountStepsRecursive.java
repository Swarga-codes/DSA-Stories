import java.util.Scanner;
//Using the recursive approach to this problem
public class CountStepsRecursive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(noOfSteps(n,0));
        in.close();
    }
    static int noOfSteps(int n,int k){
      
        if(n>0){
         if(n%2==0){
            return noOfSteps(n/2, k+1);
         }    
         else{
            return noOfSteps(n-1, k+1);
         }
        }
        return k;
    }
}

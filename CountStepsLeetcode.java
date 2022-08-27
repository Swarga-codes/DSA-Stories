import java.util.*;
public class CountStepsLeetcode {
    
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            System.out.println(noOfSteps(n));
            in.close();
        }
        static int noOfSteps(int n){
          int k=0;
            if(n>0){
             if(n%2==0){
                k++;
                return k+noOfSteps(n/2);
             }    
             else{
                k++;
                return k+noOfSteps(n-1);
                
             }
            }
            return k;
        }
}

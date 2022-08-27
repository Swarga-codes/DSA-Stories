// import java.util.*;
public class RecurseSeries {
    public static void main(String[] args) {
     Series(8);  

    }
    static void Series(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
       
    Series(n-1);
   
    
}
    
}

import java.util.ArrayList;
import java.util.List;

public class AlternatingDigitSum {
    public static void main(String[] args) {
        int n=521;
        System.out.println(alternateDigitSum(n));
    }
     public static int alternateDigitSum(int n) {
        if(n<10) return n;
        int tmp=n;
        int k=0,s=0;
        
        while(tmp!=0){
            k++;
            tmp/=10;
        }
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<k;i++){
            li.add(n%10);
            n=n/10;
        }
       for(int i=k-1;i>=0;i--){
           if((k-i-1)%2!=0){
               s-=li.get(i);
           }
           else{
               s+=li.get(i);
           }
       }
       return s;

    }
}

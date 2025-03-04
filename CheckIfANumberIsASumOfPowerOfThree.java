import java.util.HashSet;
import java.util.Set;

public class CheckIfANumberIsASumOfPowerOfThree {
    public static void main(String[] args) {
        int n=32;
        System.out.println(checkPowersOfThree(n));
    }
      public static boolean checkPowersOfThree(int n) {
        int tmp=n;
        Set<Integer> set=new HashSet<>();
        while(tmp>0){
            int x=(int)Math.cbrt(tmp);
             int pow=(int)Math.pow(3,x);
             while(x>=0 && pow>tmp){
                pow=(int)Math.pow(3,--x);
             }
            while(x>=0 && set.contains(x)){
                pow=(int)Math.pow(3,--x);
            }
            if(x<0) return false;
            set.add(x);
            tmp=tmp-pow;
            if(tmp==0) return true;
        }
        return false;
    }
}

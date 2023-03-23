import java.util.*;
public class SelfDividingNumbers {
    public static void main(String[] args) {
int left=1,right=22;
System.out.println(selfDividingNumbers(left, right));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isSelfDividing(int n){
        if(n>=1 && n<=9){
            return true;
        }
        int tmp=n,d=0;
        while(tmp!=0){
            d=tmp%10;
            if(d==0){
                return false;
            }
            if(n%d!=0){
                return false;
            }
            tmp=tmp/10;
        }
        return true;
    }
}

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int sum=0,carry=0;
        for(int i=0;i<num.length;i++){
            list.add(num[i]);
        }
        for(int i=list.size()-1;i>=0;i--){
            sum=list.get(i)+k%10+carry;
            list.set(i,sum%10);
            carry=sum/10;
            k/=10;
        }
        while(k!=0){
            sum=k%10+carry;
            list.add(0,sum%10);
            if(sum>9){
                carry=sum/10;
            }
            else{
                carry=0;
            }
            k/=10;
        }
        if(carry!=0){
            list.add(0,carry);
        }
        return list;
    }
}

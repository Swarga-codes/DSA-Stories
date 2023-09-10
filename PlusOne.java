import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits={9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=carry;
            if(digits[i]<10){
                return digits;
            }
            else{
                digits[i]%=10;
                carry=1;
            }
        }
        int[] res=new int[digits.length+1];
        res[0]=carry;
        for(int i=1;i<=digits.length;i++){
            res[i]=digits[i-1];
        }
        
        return res;
    }
}

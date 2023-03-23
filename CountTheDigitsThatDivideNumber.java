public class CountTheDigitsThatDivideNumber{
    public static void main(String[] args) {
        int num=1248;
        System.out.println(countDigits(num));
    }
    public static int countDigits(int num) {
        if(num>=1 && num<=9){
            return 1;
        }
        int tmp=num,d=0,k=0;
        while(tmp!=0){
            d=tmp%10;
            if(num%d==0){
                k++;
            }
            tmp=tmp/10;
        }
        return k;
     }

}
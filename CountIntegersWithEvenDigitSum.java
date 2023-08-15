public class CountIntegersWithEvenDigitSum {
    public static void main(String[] args) {
        int num=100;
        System.out.println(countEven(num));
    }
    public static int countEven(int num) {
        int k=0;
        for(int i=2;i<=num;i++){
                if(digitSum(i)){
                    k++;
                }
            }
        
        return k;
    }
    public static boolean digitSum(int num){
        int s=0;
        while(num!=0){
            s=s+num%10;
            num/=10;
        }
        return s%2==0;
    }
}

public class CountGoodNumbers {

    public static final long MODULO=(long)(Math.pow(10,9)+7);
    public static void main(String[] args) {
        long n=50;
        System.out.println(countGoodNumbers(n));
    }
    public static int countGoodNumbers(long n) {
       long even=(n+1)/2;
       long odd=n/2;
       long evenVal=calcPower(5,even);
       long oddVal=calcPower(4,odd);
    return (int)((evenVal*oddVal)%MODULO);
    }
    public static long calcPower(long x,long n){
        if(n==0) return 1;
        if(n==1) return x;
        long ans=calcPower(x,n/2);
        if(n%2==0){
            return (ans*ans)%MODULO;
        }
        return (x*ans*ans)%MODULO;
    }
}
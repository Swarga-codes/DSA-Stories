public class ProductOfTwoDigitNumbers {
    public static void main(String[] args) {
        long N=2222;
        System.out.println(prodTwoDigit(N));
    }
    static long prodTwoDigit(long N) {
        if(N<100) return N;
        // code here
        return findProd(N,1);
    }
    static long findProd(long N,long res){
        if(N==0) return res;
        res*=N%100;
        return findProd(N/100,(long)(res%(Math.pow(10,9)+7)));
    }
}

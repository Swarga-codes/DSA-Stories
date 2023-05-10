public class TrailingZeroes {
    public static void main(String[] args) {
        int n=5;
        System.out.println(trailingZeroes(n));
    }
    public static int trailingZeroes(int n) {
        int k=0;
        if(n<=4){
            return 0;
        }
        while(n>4){
            k=k+(n/5);
            n/=5;
        }
        return k;
    }
}

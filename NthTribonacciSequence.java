public class NthTribonacciSequence {
    public static void main(String[] args) {
        int n=25;
        System.out.println(tribonacci(n));
    }
    public static int tribonacci(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        int x=0,y=1,z=1;
        int tmp1=0;
        for(int i=3;i<=n;i++){
            tmp1=z;
            z=z+y+x;
            x=y;
            y=tmp1;
        }
        return z;

    }
}

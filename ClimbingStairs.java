public class ClimbingStairs {
    public static void main(String[] args) {
        int n=7;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        if(n<=2) return n;
        int x=1;
        int y=2;
        int tmp=0;
        for(int i=3;i<=n;i++){
            tmp=y;
            y=y+x;
            x=tmp;
        }
        return y;
     }
}

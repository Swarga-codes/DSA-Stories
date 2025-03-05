public class CountTotalNumberOfColoredCells {
    public static void main(String[] args) {
        int n=4;
        System.out.println(coloredCells(n));
    }
    public static long coloredCells(int n) {
        int k=0;
        long sum=1;
        for(int i=1;i<=n;i++){
            sum+=4*k;
            k++;
        }
        return sum;
    }
}

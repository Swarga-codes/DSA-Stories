public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num=17;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int n=(int)Math.sqrt(num);
        return n*n==num;
    }
}

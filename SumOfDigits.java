import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("The sum is: " + sum(n));
        in.close();
    }

    static int sum(int n) {
        int s = 0;

        if (n >= 10) {
            s += n % 10;
            return s + sum(n / 10);
        }
        return n;
    }
}

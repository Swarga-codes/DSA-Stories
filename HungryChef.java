import java.util.Scanner;

public class HungryChef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int n = in.nextInt();
            int r = in.nextInt();
            int premium = 0;
            int normal = 0;
            if (n * y <= r) {
                System.out.println(normal + " " + n);
            } else if (r < x * n) {
                System.out.println(-1);
            } else {

                normal = (r - n * y) / (x - y);
                if ((r - n * y) % (x - y) != 0) {
                    normal++;
                }
                premium = n - normal;
                System.out.println(normal + " " + premium);
            }

        }
    }
}

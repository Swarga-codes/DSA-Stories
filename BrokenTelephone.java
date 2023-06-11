import java.util.Scanner;

public class BrokenTelephone {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int err = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] != arr[j + 1]) {
                    err = err + 2;
                    if(j>0 && arr[j]!=arr[j-1] && arr[j]!=arr[j+1]){
                        err--;
                    }
                }
               
            }
            System.out.println(err);
}    
}
}

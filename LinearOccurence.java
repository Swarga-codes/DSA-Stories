import java.util.*;

public class LinearOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        Linear(arr, target, 0);
        System.out.println(list);
        in.close();
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void Linear(int[] arr, int target, int index) {

        if (index > arr.length - 1) {
            return;
        }
        if (target == arr[index]) {
            list.add(index);

        }
        Linear(arr, target, index + 1);

    }
}

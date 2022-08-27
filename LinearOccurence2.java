import java.util.*;
public class LinearOccurence2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        ArrayList <Integer> list=new ArrayList<>();
        System.out.println(Linear(arr,target,0,list));
        in.close();
    }

    

    static List <Integer> Linear(int[] arr, int target, int index,ArrayList<Integer> list) {

        if (index > arr.length - 1) {
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
            
        }
       return Linear(arr, target, index + 1,list);

    }
}

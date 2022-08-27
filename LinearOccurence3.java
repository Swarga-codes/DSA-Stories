import java.util.*;
public class LinearOccurence3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
       
        System.out.println(Linear(arr,target,0));
        in.close();
    }

    

    static ArrayList<Integer> Linear(int[] arr, int target, int index){
ArrayList<Integer> list=new ArrayList<>();
        if (index > arr.length - 1) {
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
            
        }
       ArrayList<Integer> newList= Linear(arr, target, index + 1);
  list.addAll(newList);
  return list;
    }
}



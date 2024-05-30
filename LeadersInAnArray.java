import java.util.*;
public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr={16,17,9,12,88};
        int n=arr.length;
        System.out.println(leaders(arr, n));
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,arr[i]);
            if(arr[i]>=max){
                list.add(arr[i]);
            }
        }
         Collections.reverse(list);
        return list;
    }
}

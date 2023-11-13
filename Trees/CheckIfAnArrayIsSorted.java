package Trees;

public class CheckIfAnArrayIsSorted {
    public static void main(String[] args) {
       int[] arr={1,6,9,12};
       System.out.println(arraySortedOrNot(arr, arr.length)); 
    }
    static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
       if(n==1) return true;
       if(arr[n-1]<arr[n-2]) return false;
       return arraySortedOrNot(arr,n-1);
    }
}

public class ArraySorted {
    public static void main(String[] args) {
int[] arr={1,2,2,3,4,5};
        if(isSorted(arr)!=0){
            System.out.println("The given array is not sorted.");
        }
        else{
            System.out.println("The given array is sorted.");
        }
    }
    static int isSorted(int[] arr){
        int flag=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=1;
            }
        }
        return flag;
    }
}

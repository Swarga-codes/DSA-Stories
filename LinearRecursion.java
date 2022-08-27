import java.util.*;
public class LinearRecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        System.out.println(Linear(arr,target,0));
        in.close();
    }
    static int Linear(int[] arr,int target,int index){
        if(index>arr.length-1){
            return -1;
        }
        if(target==arr[index]){
            return index;
        }
        return Linear(arr,target,index+1);
    }
}

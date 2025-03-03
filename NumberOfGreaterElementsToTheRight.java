import java.util.Arrays;

public class NumberOfGreaterElementsToTheRight {
    public static void main(String[] args) {
        int N=4;
        int[] arr={3,1,4,5};
        int queries=2;
        int[] indices={0,2};
        System.out.println(Arrays.toString(count_NGEs(N, arr, queries, indices)));
    }
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        int[] ans=new int[queries];
         for(int i=0;i<queries;i++){
             int count=0;
             for(int j=indices[i]+1;j<N;j++){
                 if(arr[indices[i]]<arr[j]){
                     count++;
                 }
             }
             ans[i]=count;
         }
        return ans;
      }
}

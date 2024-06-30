import java.util.ArrayList;
import java.util.Arrays;

public class PaintersPartitionProblem {
    public static void main(String[] args) {
        ArrayList<Integer> boards=new ArrayList<>(Arrays.asList(2,1,5,6,2,3));
        int k=2;
        System.out.println(findLargestMinDistance(boards, k));
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<boards.size();i++){
            sum+=boards.get(i);
            max=Math.max(max, boards.get(i));
        }
        int l=max,h=sum,mid;
        while(l<=h){
            mid=(l+h)/2;
            if(isPossible(boards,mid,k)){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public static boolean isPossible(ArrayList<Integer> boards,int possible,int k){
        int count=0,sum=0;
        for(int i=0;i<boards.size();i++){
            if(sum+boards.get(i)<=possible){
                sum+=boards.get(i);
            }
            else{
                count++;
                sum=boards.get(i);
            }
        }
        if(sum>0) count++;

        return count<=k;
    }
}

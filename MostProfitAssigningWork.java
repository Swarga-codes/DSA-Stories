import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MostProfitAssigningWork {
    public static void main(String[] args) {
        int[] difficulty = {85,47,57}, profit = {24,66,99}, worker = {40,25,25};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<difficulty.length;i++){
            List<Integer> curr=new ArrayList<>();
            curr.add(difficulty[i]);
            curr.add(profit[i]);
            list.add(curr);
        }
        Collections.sort(list,(a,b)->a.get(0)-b.get(0));
        Arrays.sort(worker);
        int j=0,max=0,curr=0;
        for(int i=0;i<worker.length;i++){
            while(j<difficulty.length && list.get(j).get(0)<=worker[i]){
                curr=Math.max(curr,list.get(j).get(1));
                j++;
            }
            max+=curr;
        }
        return max;
    }
}

import java.util.*;
public class IPO {
    public static void main(String[] args) {
       int k = 2, w = 0;
       int[] profits = {1,2,3}, capital = {0,1,1};
       System.out.println(findMaximizedCapital(k, w, profits, capital));
    }
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int j=0;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<profits.length;i++){
            List<Integer> curr=new ArrayList<>();
            curr.add(capital[i]);
            curr.add(profits[i]);
            list.add(curr);
        }
        Collections.sort(list,(a,b)->a.get(0)-b.get(0));
         PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<k;i++){
            
           while(j<list.size() && list.get(j).get(0)<=w){
            pq.add(list.get(j).get(1));
            j++;
           }
            if(pq.isEmpty()){
                break;
            }
            w+=pq.poll();
           
        }
        return w;
    }
}

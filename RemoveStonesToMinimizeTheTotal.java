import java.util.*;
class RemoveStonesToMinimizeTheTotal{
    public static void main(String[] args) {
        int[] piles={5,4,9};
        int k=2;
        System.out.println(minStoneSum(piles, k));
    }
    public static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int res=0;
        for(int pile:piles){
            pq.add(pile);
        }
        for(int i=1;i<=k;i++){
            int max=pq.poll();
            int el=max-(int)Math.floor(max/2);
            pq.add(el);
            
        }
        while(!pq.isEmpty()){
            res+=pq.poll();
        }
        return res;
    }
}
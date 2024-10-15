import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFromTheRichestPile {
    public static void main(String[] args) {
        int[] gifts={25,64,9,4,100};
        int k=4;
        System.out.println(pickGifts(gifts, k));
    }
    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int gift:gifts){
            pq.add(gift);
        }
        for(int i=1;i<=k;i++){
            int max=pq.poll();
            max=(int)Math.floor(Math.sqrt(max));
            pq.add(max);
        }
        long res=0;
        while(!pq.isEmpty()){
            res+=pq.poll();
        }
        return res;
    }
}

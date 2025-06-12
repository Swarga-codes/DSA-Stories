import java.util.PriorityQueue;

public class KthLargest {

      PriorityQueue<Integer> pq;
    int kth=0;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>();
        kth=k;
        for(int n:nums){
            add(n);
        }
    }
    
    public int add(int val) {
        if(pq.size()<kth || pq.peek()<val){
            pq.add(val);
            if(pq.size()>kth){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
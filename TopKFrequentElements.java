import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
  public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->Integer.compare(a.getValue(),b.getValue()));
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> en:mp.entrySet()){
            pq.add(en);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll().getKey();
        }
        return res;
    }
}

import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
      List<Integer> list=new ArrayList<>(map.keySet());
      list.sort((a,b)->map.get(b)-map.get(a));
      int[] res=new int[k];
      for(int i=0;i<k;i++){
          res[i]=list.get(i);
      }
      return res;
}
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"}; 
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }
     public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else{
                map.put(words[i],1);
            }
        }
         List<String> list=new ArrayList<>(map.keySet());
         list.sort((a,b)->map.get(a)==map.get(b)?a.compareTo(b):map.get(b)-map.get(a));
       
        List<String> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(list.get(i));
        }
        return res;
    }
}

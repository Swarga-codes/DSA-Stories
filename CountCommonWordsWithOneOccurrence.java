import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
       String[] words1 = {"leetcode","is","amazing","as","is"}, words2 = {"amazing","leetcode","is"};
       System.out.println(countWords(words1, words2));
    }
    public static int countWords(String[] words1, String[] words2) {
        Map<String,Integer> m1=new HashMap<>();
        Map<String,Integer> m2=new HashMap<>();
        for(int i=0;i<words1.length;i++){
            if(m1.containsKey(words1[i])){
                m1.put(words1[i],m1.get(words1[i])+1);
            }
            else{
                m1.put(words1[i],1);
            }
        }
         for(int i=0;i<words2.length;i++){
            if(m2.containsKey(words2[i])){
                m2.put(words2[i],m2.get(words2[i])+1);
            }
            else{
                m2.put(words2[i],1);
            }
        }
        List<String> l1=new ArrayList<>(m1.keySet());
        List<String> l2=new ArrayList<>(m2.keySet());
        l1.removeIf(l->m1.get(l)!=1);
        l2.removeIf(l->m2.get(l)!=1);
        int count=0;
        for(int i=0;i<l1.size();i++){
            if(l2.contains(l1.get(i))){
               count++;
            }
        }
        return count;
    }
}

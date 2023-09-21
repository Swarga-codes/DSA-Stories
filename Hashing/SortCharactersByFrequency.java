package Hashing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
            String res="";
       for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i),map.get(s.charAt(i))+1);
           }
           else{
               map.put(s.charAt(i),1);
           }
       }
   List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
   Collections.sort(list,(a,b)->{
       return b.getValue().compareTo(a.getValue());
   });
   
       for (Map.Entry<Character, Integer> entry : list) {
            int j=0;
           while(j<entry.getValue()){
               res+=entry.getKey();
               j++;
           }
       }
       return res;

   }
}

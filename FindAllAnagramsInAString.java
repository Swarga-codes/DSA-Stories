import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s="cbaebabacd",p="abc";
        System.out.println(findAnagrams(s, p));
    }
     public static List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()) return new ArrayList<>();
       List<Integer> res=new ArrayList<>();
       Map<Character,Integer> map1=new HashMap<>();
       Map<Character,Integer> map2=new HashMap<>();
       for(int i=0;i<p.length();i++){
        map1.put(p.charAt(i),map1.getOrDefault(p.charAt(i),0)+1);
        map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
       }
       int start=0;
       if(mapChecker(map1,map2)){
        res.add(start);
       }
       for(int i=p.length();i<s.length();i++){
        map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
        if(map2.containsKey(s.charAt(i))){
            if(map2.get(s.charAt(start))==1){
                map2.remove(s.charAt(start));
            }
            else{
                map2.put(s.charAt(start),map2.get(s.charAt(start))-1);
            }
            start++;
        }
        if(mapChecker(map1,map2)){
            res.add(i-p.length()+1);
        }       
       } 
       return res;
    }
     public static boolean mapChecker(Map<Character,Integer> map1,Map<Character,Integer> map2){
        if(map1.size()!=map2.size()){
            return false;
        }
        for(Map.Entry<Character,Integer> entry:map1.entrySet()){
            if(!entry.getValue().equals(map2.get(entry.getKey()))){
                return false;
            }
        }
        return true;
    }

}

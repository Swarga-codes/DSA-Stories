import java.util.*;

public class PermutationInString {
    public static void main(String[] args) {
        String s1="ab",s2="eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        Map<Character, Integer> map1=new HashMap<>();
        Map<Character, Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        if(mapChecker(map1,map2)){
            return true;
        }
        int start=0;
        for(int i=s1.length();i<s2.length();i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
            if(map2.containsKey(s2.charAt(start))){
                if(map2.get(s2.charAt(start))==1){
                    map2.remove(s2.charAt(start));
                }
                else{
                    map2.put(s2.charAt(start),map2.get(s2.charAt(start))-1);
                }
                start++;
            }
            if(mapChecker(map1,map2)){
                return true;
            }
            
        }
        return mapChecker(map1,map2);
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

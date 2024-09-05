import java.util.*;
class ValidAnagram{
    public static void main(String[] args) {
        String s="anagram",t="nagaram";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>(); 
         for(int i=0;i<s.length();i++){
             if(map.containsKey(s.charAt(i))){
                 map.put(s.charAt(i),map.get(s.charAt(i))+1);
             }
             else{
                 map.put(s.charAt(i),1);
             }
         }
         for(int i=0;i<t.length();i++){
             if(map.containsKey(t.charAt(i))){
                 map.put(t.charAt(i),map.get(t.charAt(i))-1);
             }
             else{
                 map.put(t.charAt(i),1);
             }
         }
         for(Map.Entry<Character,Integer> entry:map.entrySet()){
             if(entry.getValue()!=0){
                 return false;
             }
         }
         return true;
     }
}
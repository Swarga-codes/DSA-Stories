import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
       String s="foo",t="bar";
       System.out.println(isIsomorphic(s, t)); 
    }
     public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                if(map1.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                map1.put(s.charAt(i),t.charAt(i));
            }
            if(map2.containsKey(t.charAt(i))){
                if(map2.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }
            else{
                map2.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}

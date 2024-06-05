import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
public static void main(String[] args) {
    String[] words={"cool","cook","lock"};
    System.out.println(commonChars(words));
}
public static List<String> commonChars(String[] words) {
        Map<Character,Integer> map=new HashMap<>();
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words[0].length();i++){
            char c=words[0].charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=1;i<words.length;i++){
            Map<Character,Integer> currentMap=new HashMap<>();
            for(int j=0;j<words[i].length();j++){
                char c=words[i].charAt(j);
                currentMap.put(c,currentMap.getOrDefault(c,0)+1);
            }
            for(Map.Entry<Character,Integer> el:map.entrySet()){
                if(currentMap.containsKey(el.getKey())){
                    map.put(el.getKey(),Math.min(el.getValue(),currentMap.get(el.getKey())));
                }
                else{
                    map.put(el.getKey(),0);
                }
            }
        }
        for(Map.Entry<Character,Integer> el:map.entrySet()){
            for(int i=0;i<el.getValue();i++){
                ans.add(el.getKey()+"");
            }
        }
        return ans;
    }
    
}
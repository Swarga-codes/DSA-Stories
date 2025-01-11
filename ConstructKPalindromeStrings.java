import java.util.HashMap;
import java.util.Map;

public class ConstructKPalindromeStrings {
    public static void main(String[] args) {
        String s="leetcode";
        int k=3;
        System.out.println(canConstruct(s, k));
    }
     public static boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int oddCount=0;
        for(Map.Entry<Character,Integer> en:mp.entrySet()){
            if(en.getValue()%2!=0){
                oddCount++;
            }
        }
        return oddCount<=k;
    }
}

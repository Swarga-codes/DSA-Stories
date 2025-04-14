import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s="AABBCCC";
        int k=2;
        System.out.println(characterReplacement(s, k));
    }
     public static int characterReplacement(String s, int k) {
        int maxFreq=0,max=0,l=0;
            Map<Character,Integer> mp=new HashMap<>();
            for(int j=0;j<s.length();j++){
                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
                maxFreq=Math.max(maxFreq,mp.get(s.charAt(j)));
                if(j-l+1-maxFreq>k){
                    mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                    l++;
                }
                if(j-l+1-maxFreq<=k){
                    max=Math.max(max,j-l+1);
                }
            }
        return max;
    }
}

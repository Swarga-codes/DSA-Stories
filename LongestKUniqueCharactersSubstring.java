import java.util.HashMap;
import java.util.Map;

public class LongestKUniqueCharactersSubstring {
    public static void main(String[] args) {
        String s="aabbccddeeeee";
        int k=3;
        System.out.println(longestkSubstr(s,k));
    }
     public static int longestkSubstr(String s, int k) {
        // code here
        int l=0,r=0,max=0;
        Map<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            if(map.size()==k){
                max=Math.max(max,r-l+1);
            }
            while(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            r++;
        }
        return max==0?-1:max;
    }
}

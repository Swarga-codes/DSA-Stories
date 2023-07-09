import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
     public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int start=0,end=0;
        Set<String> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        while(end<s.length()){
            while(end<s.length() && !set.contains(s.charAt(end)+"")){
                set.add(s.charAt(end++)+"");
            }
            max=Math.max(max,end-start);
            set.remove(s.charAt(start)+"");
            start++;
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}

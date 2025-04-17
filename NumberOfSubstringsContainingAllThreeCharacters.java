import java.util.HashMap;
import java.util.Map;

public class NumberOfSubstringsContainingAllThreeCharacters {

    public static void main(String[] args) {
        String s="abcabc";
        System.out.println(numberOfSubstrings(s));
    }
     public static int numberOfSubstrings(String s) {
        int res=0;
       int l=0,r=0;
       Map<Character,Integer> map=new HashMap<>();
       while(r<s.length()){
        map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
        while(map.size()==3){
            res+=s.length()-r;
            map.put(s.charAt(l),map.get(s.charAt(l))-1);
            if(map.get(s.charAt(l))==0) {
                map.remove(s.charAt(l));
            }
            l++;
        }
        r++;
       }
        return res;
    }
}
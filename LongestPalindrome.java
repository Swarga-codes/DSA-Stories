import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s="abccccdd";
        System.out.println(longestPalindrome(s));
    }
      public static int longestPalindrome(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        int countEven=0;
        int countOdd=0;
        int extras=0;
         for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         }
         for(Map.Entry<Character,Integer> el:map.entrySet()){
            if(el.getValue()%2!=0){
                if(el.getValue()!=1){
                    countOdd+=el.getValue()-1;
                }
               extras=1;
            }
            else if(el.getValue()%2==0){
                countEven+=el.getValue();
            }
         }
         return countEven+countOdd+extras;
             }
}

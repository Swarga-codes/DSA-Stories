import java.util.Arrays;

public class LongestCommonPrefixOptimal {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
        public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String x=strs[0];
        String y=strs[strs.length-1];
        int i=0;
        String ans="";
        while(i<x.length() && i<y.length()){
            if(x.charAt(i)==y.charAt(i)){
                ans+=x.charAt(i++);
            }
            else{
                break;
            }
        }
        return ans;
    }
}

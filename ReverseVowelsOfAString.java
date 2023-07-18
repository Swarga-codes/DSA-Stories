import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        String tmp="";
        List<String> list=Arrays.asList("a","e","i","o","u","A","E","I","O","U");
        HashSet<String> set=new HashSet<>();
        set.addAll(list);
        for(int i=0;i<s.length();i++){
                if(set.contains(s.charAt(i)+"")){
                tmp+=s.charAt(i);
            }
        }
        int k=tmp.length()-1;
        for(int i=0;i<s.length();i++){
                if(set.contains(s.charAt(i)+"")){
                 s=s.substring(0,i)+tmp.charAt(k--)+s.substring(i+1);
        }
    }
    return s;
}
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowelsInAString {
    public static void main(String[] args) {
        String s="lEetcOde";
        System.out.println(sortVowels(s));
    }
    public static String sortVowels(String s) {
        List<Character> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                li.add(s.charAt(i));
            }
        }
        Collections.sort(li);
        char[] ch=s.toCharArray();
        int k=0;
        for(int i=0;i<ch.length;i++){
            if(isVowel(ch[i])){
                ch[i]=li.get(k++);
            }
        }
    s="";
        for(int i=0;i<ch.length;i++){
            s+=ch[i];
        }
        return s;
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}

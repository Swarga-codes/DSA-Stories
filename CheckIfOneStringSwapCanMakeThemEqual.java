import java.util.*;

class CheckIfOneStringSwapCanMakeThemEqual{
    public static void main(String[] args){
        String s1="kanb",s2="bank";
        System.out.println(areAlmostEqual(s1,s2));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int countSafe=0;
        int[] m1=new int[26];
        int[] m2=new int[26];
        for(int i=0;i<s1.length();i++){
            m1[s1.charAt(i)-'a']++;
            m2[s2.charAt(i)-'a']++;
            if(s1.charAt(i)!=s2.charAt(i)){
                countSafe++;
            }
            if(countSafe>2) return false; 
        }
       
        return Arrays.equals(m1,m2);
    }
}
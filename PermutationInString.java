import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s1="ab",s2="eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
       public static boolean checkInclusion(String s1, String s2) {
        s1=helperSort(s1);
        for(int i=0;i<=s2.length()-s1.length();i++){
            if(s1.equals(helperSort(s2.substring(i,i+s1.length())))){
                return true;
            }
        }
        return false;
    }
    public static String helperSort(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}

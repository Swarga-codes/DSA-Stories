public class MakingStringASubsequenceUsingCyclicIncrements {
    public static void main(String[] args) {
        String str1 = "abc", str2 = "ad";
        System.out.println(canMakeSubsequence(str1, str2));
    }
    public static boolean canMakeSubsequence(String str1, String str2) {
        if(str2.length()>str1.length()) return false;
        int i=0,j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }
            else if((char)(str1.charAt(i)+1)==(char)(str2.charAt(j))){
                i++;
                j++;
            }
            else if(str1.charAt(i)=='z'){
                if('a'==str2.charAt(j)){
                    j++;
                }
                i++;
            }
            else {
                i++;
            }
        }
        return j==str2.length();
    }
}

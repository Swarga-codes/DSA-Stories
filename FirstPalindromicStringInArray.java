public class FirstPalindromicStringInArray {
    public static void main(String[] args) {
        String[] words={"abc","abd","aca","def"};
        System.out.println(firstPalindrome(words));
    }
    public static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalin(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public static boolean isPalin(String s){
        String tmp="";
        for(int i=s.length()-1;i>=0;i--){
            tmp+=s.charAt(i);
        }
        return tmp.equals(s);
    }
}

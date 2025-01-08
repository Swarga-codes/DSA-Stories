public class CheckIfStringIsAPrefixOfAnArray {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s, words));
    }
    public static boolean isPrefixString(String s, String[] words) {
        String chk="";
        for(int i=0;i<words.length;i++){
            chk+=words[i];
            if(chk.equals(s)){
                return true;
            }
                    }
        return false;
    }
}

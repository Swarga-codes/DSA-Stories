public class ReverseWordsInAString3 {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s=s+" ";
        int start=0;
        String res="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=' ' && s.charAt(i+1)==' '){
                res+=reverse(s.substring(start,i+1))+" ";
                start=i+2;
            }
        }
        return res.trim();
    }
    public static String reverse(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        return reverse;
    }
}

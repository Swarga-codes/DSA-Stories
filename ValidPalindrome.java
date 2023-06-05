public class ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String tmp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || (s.charAt(i)-'0')>=0 && (s.charAt(i)-'0')<=9){
                tmp+=s.charAt(i);
            }
            else{
                continue;
            }
        }
        String x="";
        for(int i=tmp.length()-1;i>=0;i--){
            x+=tmp.charAt(i);
        }
        return x.equals(tmp);
    }
}

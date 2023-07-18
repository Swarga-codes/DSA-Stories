public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !isVowel(ch[i])) {
                i++;
            }
            while (i < j && !isVowel(ch[j])) {
                j--;
            }
            if (i < j) {
                char tmp = ch[i];
                ch[i] = ch[j];
                ch[j] = tmp;
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    
}

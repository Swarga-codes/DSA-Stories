public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
    public static char findTheDifference(String s, String t) {
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            x+=(int)s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            y+=(int)t.charAt(i);
        }


        
        return (char)(y-x);
    }
}

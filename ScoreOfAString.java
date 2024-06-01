public class ScoreOfAString {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(scoreOfString(s));
    }
    public static int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum+=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        return sum;
    }
}

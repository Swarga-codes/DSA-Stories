public class SeparateBlackAndWhiteBalls {
    public static void main(String[] args) {
        String s="101";
        System.out.println(minimumSteps(s));
    }
    public static long minimumSteps(String s) {
        long res=0,blackCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                res+=blackCount;
            }
            else{
                blackCount++;
            }
        }
        return res;
    }
}

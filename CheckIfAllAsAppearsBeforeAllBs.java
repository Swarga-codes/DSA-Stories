public class CheckIfAllAsAppearsBeforeAllBs {
    public static void main(String[] args) {
       String s="aaabbb";
       System.out.println(checkString(s)); 
    }
    public static boolean checkString(String s) {
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                flag=true;
            }
            if(flag && s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}

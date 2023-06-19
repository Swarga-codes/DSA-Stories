public class RemoveTrailingZeroesFromString {
   public static void main(String[] args) {
    String s="521000";
    System.out.println(removeTrailingZeros(s));
   } 
    public static String removeTrailingZeros(String s) {
        if(s.charAt(s.length()-1)!='0'){
            return s;
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='0'){
                s=s.substring(0,i+1);
                break;
            }
        }
        return s;
    }
}

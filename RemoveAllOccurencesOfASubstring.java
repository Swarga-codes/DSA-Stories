public class RemoveAllOccurencesOfASubstring {
    public static void main(String[] args) {
        String s="daabcbaabcbc",part="abc";
        System.out.println(removeOccurrences(s, part));
    }
    public static String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.indexOf(part)!=-1){
            sb.replace(sb.indexOf(part),sb.indexOf(part)+part.length(),"");
        }
       return sb.toString(); 
    }
}

public class AppendCharactersToStringToMakeSubsequence {
    public static void main(String[] args) {
        String s="coaching",t="coding";
        System.out.println(appendCharacters(s, t));
    }
    public static int appendCharacters(String s, String t) {
        if(s.indexOf(t)!=-1) return 0;
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else {
                i++;
            }
        }
        return t.length()-j;
    }
}

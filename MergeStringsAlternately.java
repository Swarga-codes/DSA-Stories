public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String alt="";
        while(i<word1.length() && j<word2.length()){
            alt+=word1.charAt(i++);
            alt+=word2.charAt(j++);
        }
        if(i<word1.length()){
            alt+=word1.substring(i,word1.length());
        }
        if(j<word2.length()){
            alt+=word2.substring(j,word2.length());
        }
        return alt;
    }
}

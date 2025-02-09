public class IndexOfTheFirstOccurenceOfPatternInAText {
    public static void main(String[] args) {
        String text="abbc",pat="bc";
        System.out.println(findMatching(text, pat));
    }
    public static int findMatching(String text, String pat) {
        // Code here
        int idx=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==pat.charAt(idx)){
                idx++;
                if(idx==pat.length()){
                return i-idx+1;
            }
            }
            else{
                if(idx>0){
                    i=i-idx;
                }
                idx=0;
            }
            
        }
        return -1;
    }
}

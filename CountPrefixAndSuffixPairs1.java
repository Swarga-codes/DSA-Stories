public class CountPrefixAndSuffixPairs1 {
    public static void main(String[] args) {
        String[] words={"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }
    public static int countPrefixSuffixPairs(String[] words) {
        int cnt=0;
        for(int i=0;i<words.length;i++){
            for(int j=i;j<words.length;j++){
                if(i==j){
                    continue;
                }
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

import java.util.Arrays;

public class LongestStringChain {
    public static void main(String[] args) {
        String[] words={"xbc","pcxbcf","xb","cxbc","pcxbc"};
    System.out.println(longestStrChain(words));
    }
      public static int longestStrChain(String[] words) {
        Arrays.sort(words,(x,y)->Integer.compare(x.length(),y.length()));
        int max=1;
        int[] storeLength=new int[words.length];
        Arrays.fill(storeLength,1);
        for(int i=1;i<words.length;i++){
            for(int j=0;j<i;j++){
                if(words[i].length()==words[j].length()+1 && isSubstring(words[i],words[j])){
                    storeLength[i]=Math.max(storeLength[i],storeLength[j]+1);
                }
            }
            max=Math.max(max,storeLength[i]);
        }
       
        return max;
    }
    public static boolean isSubstring(String s, String r){
        int i=0,j=0;
       while(i<s.length() && j<r.length()){
           if(s.charAt(i)==r.charAt(j)){
               j++;
           }
        i++;
       }
       if(j==r.length()){
           return true;
       }
       return false;
    }
}

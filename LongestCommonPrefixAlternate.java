/**
 * LongestCommonPrefixAlternate
 */
public class LongestCommonPrefixAlternate {
public static void main(String[] args) {
    String[] strs={"flower","flow","flight"};
    System.out.println(longestCommonPrefix(strs));
}
public static String longestCommonPrefix(String[] strs) {
    String res=strs[0];
    for(int i=1;i<strs.length;i++){
        String tmp="";
        for(int j=0;j<strs[i].length();j++){
            if(j<res.length() && res.charAt(j)==strs[i].charAt(j)){
                tmp=strs[i].substring(0,j+1);
            }
            else{
                break;
            }
        }
        if(tmp.length()<res.length()){
            res=tmp;
        }
    }
    return res;
}
}
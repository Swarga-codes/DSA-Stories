public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String longest=commonPrefix(strs[0],strs[1]);
        String next="";
        for(int i=1;i<strs.length-1;i++){
            next=commonPrefix(strs[i],strs[i+1]);
            if(longest.length()<next.length()){
                continue;
            }
            else{
                longest=next;
            }
        }
     return longest;

}
public static String commonPrefix(String a,String b){
    int i=0,j=0;
    String dummy="";
    while(i<a.length() && j<b.length()){
        if(a.charAt(i)==b.charAt(j)){
            dummy+=a.charAt(i);
            i++;
            j++;
        }
        else{
            break;
        }
    }
    return dummy;
}
}

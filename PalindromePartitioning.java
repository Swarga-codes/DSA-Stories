import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s="aabb";
        System.out.println(partition(s));
    }
     public static List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
    solve(new ArrayList<>(),res,0,s);
    return res;
    }
    public static void solve(List<String> ls,List<List<String>> res,int idx,String s){
        if(idx==s.length()){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s.substring(idx,i+1))){
                ls.add(s.substring(idx,i+1));
                solve(ls,res,i+1,s);
                ls.remove(ls.size()-1);
            }
        }
        
    }
    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}

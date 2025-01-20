import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        String digits="23";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.equals("")) return new ArrayList<>();
        List<String> res=new ArrayList<>();
        Map<Character,String> mp=new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
        solve(digits,0,new StringBuilder(),res,mp);
        return res;
    }
    public static void solve(String digits,int i,StringBuilder sb,List<String> res,Map<Character,String> mp){
        if(i==digits.length()){
            res.add(sb.toString());
            return;
        }
        String s=mp.get(digits.charAt(i));
        for(int j=0;j<s.length();j++){
            sb.append(s.charAt(j));
            solve(digits,i+1,sb,res,mp);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
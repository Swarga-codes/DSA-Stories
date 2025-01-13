import java.util.ArrayList;
import java.util.List;

public class BinaryStringWithNoConsecutiveOnes {
    public static void main(String[] args) {
        int N=2;
        System.out.println(generateString(N));
    }
     public static List< String > generateString(int N) {
        // Write your code here.
        List<String> res=new ArrayList<>();
        generate(N, new StringBuilder(), res);
        return res;
    }
    public static void generate(int n,StringBuilder sb,List<String> res){
        if(n==sb.length()){
	        res.add(new StringBuilder(sb).toString());
	        return;
	    }
	    sb.append('0');
	    generate(n,sb,res);
	    sb.deleteCharAt(sb.length()-1);
        if(sb.length()==0 || sb.charAt(sb.length() - 1) != '1'){
        sb.append('1');
	    generate(n,sb,res);
	    sb.deleteCharAt(sb.length()-1);
        
        }
	     
	}
}

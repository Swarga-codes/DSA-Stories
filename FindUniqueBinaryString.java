import java.util.*;
public class FindUniqueBinaryString {

    public static void main(String[] args) {
        String[] nums={"10","01"};
        System.out.println(findDifferentBinaryString(nums));
    }
    public static String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        Set<String> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return solve(set,0,new StringBuilder(),n);
    }
    public static String solve(Set<String> set,int idx, StringBuilder sb,int n){
        if(idx>=n){
            if(!set.contains(sb.toString())){
                return sb.toString();
            }
            return "";
        }
        sb.append("0");
        String ones=solve(set,idx+1,sb,n);
        if(!ones.isEmpty()){
            return ones;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("1");
        String zeroes=solve(set,idx+1,sb,n);
         sb.deleteCharAt(sb.length()-1);
        return zeroes;
    }
}
import java.util.HashSet;
public class OptimalPartitionOfString {
    public static void main(String[] args) {
       String s = "abacaba";
       System.out.println(partitionString(s));
    }
    public static int partitionString(String s) {
        int k=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.clear();
                k++;
                set.add(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
            }
        }
    return k+1;
    }
}

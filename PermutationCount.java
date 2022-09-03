public class PermutationCount {
    public static void main(String[] args) {
      System.out.println(permutateCount("", "abc"));
    }
    static int permutateCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String e=p.substring(i, p.length());
            count = count + permutateCount(f+ch+e, up.substring(1));
        }
        return count;
    }
}

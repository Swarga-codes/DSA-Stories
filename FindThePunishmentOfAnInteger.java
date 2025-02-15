public class FindThePunishmentOfAnInteger {
    public static void main(String[] args) {
        int n=10;
        System.out.println(punishmentNumber(n));
    }
    public static int punishmentNumber(int n) {
        int res=0;
        for(int i=1;i<=n;i++){
            int square=i*i;
            if(canBePartitioned(String.valueOf(square),i,0,0)){
                res+=square;
            }
        }
        return res;
    }
    public static boolean canBePartitioned(String s,int n,int sum,int idx){
        if(s.length()<2) return (n+"").equals(s);
        if(idx==s.length()){
            if(sum==n){
                return true;
            }
            return false;
        }
        for(int i=idx;i<s.length();i++){
            int tmp=Integer.parseInt(s.substring(idx,i+1));
            if(canBePartitioned(s,n,sum+tmp,i+1)){
                return true;
            }
        }
        return false;
    }
}

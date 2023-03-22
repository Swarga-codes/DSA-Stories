public class KthFactorOfN {
    public static void main(String[] args) {
        int n=12,k=3;
        System.out.println(kthFactor(n, k));
    }
    public static int kthFactor(int n, int k) {
        int count=0,pos=-1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count==k){
                pos=i;
                break;
            }
        }
        return pos;
    }
}

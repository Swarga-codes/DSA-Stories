public class CommonFactors {
    public static void main(String[] args) {
        int a=12,b=6;
        System.out.println(commonFactors(a, b));
    }
    public static int commonFactors(int a, int b) {
        int n=a>b?b:a;
        int count=0;
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}

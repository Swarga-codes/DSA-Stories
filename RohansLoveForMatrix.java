public class RohansLoveForMatrix {
    public static void main(String[] args) {
        int n=3;
        System.out.println(firstElement(n));
    }
    static int firstElement(int n) {
        // code here
        int a10=1,a11=0,tmp1=0,tmp2=0;
        for(int i=0;i<n-1;i++){
           tmp1=(a10*1+a11*1)%1000000007;
           tmp2=(a10*1+a11*0)%1000000007;
           a10=tmp1;
           a11=tmp2;
         
        }
        return a10;
    }
}

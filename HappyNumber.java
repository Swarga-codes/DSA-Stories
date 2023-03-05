public class HappyNumber {
    public static void main(String[] args) {
        int n=7;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int s=0,d=0;
         if(n==1 || n==7){
             return true;
         }
         if(n<=9){
             return false;
         }
         int tmp=n;
         while(tmp!=0){
             d=tmp%10;
             s=s+(int)Math.pow(d,2);
             tmp=tmp/10;
         }
         if(s==1){
             return true;
         }
         return isHappy(s);
          
          }
}

public class ThreeDivisors {
    public static void main(String[] args) {
      int n=5;
      System.out.println(isThree(n));  
    }
    public static boolean isThree(int n) {
        int k=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                k++;
            }
            if(k>2){
                return false;
            }
        }
        return k+1==3;
    }
}

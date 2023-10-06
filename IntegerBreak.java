public class IntegerBreak {
    public static void main(String[] args) {
      int n=10;
      System.out.println(integerBreak(n));  
    }
    public static int integerBreak(int n) {
        if(n<4) return n-1;
        if(n%3==0){
            return (int)Math.pow(3,n/3);
        }
        else if(n%3==1){
            return (int) Math.pow(3,n/3-1)*4;
        }

        return (int) Math.pow(3,n/3)*2;
    }
}

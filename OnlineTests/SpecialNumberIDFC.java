package OnlineTests;
public class SpecialNumberIDFC {
    public static void main(String[] args) {
        int x=19,y=113,n=13;
      findSpecialNumber(x, y, n);
      }
      public static void findSpecialNumber(int X,int Y,int N){
          for(int i=X;i<=Y;i++){
              if(isTwoFactor(i) && containsDigit(i,N)){
                  System.out.print(i+" ");
              }
          }
      }
      public static boolean isTwoFactor(int n){
          int k=0;
          for(int i=1;i<=n;i++){
              if(n%i==0){
                  k++;
              }
          }
          return k==2;
      }
      public static boolean containsDigit(int i,int n){
          String x=i+"";
          String y=n+"";
          for(int k=0;k<x.length();k++){
              for(int j=0;j<y.length();j++){
                  if(x.charAt(k)==y.charAt(j)){
                      return true;
                  }
              }
          }
          return false;
      }    
}

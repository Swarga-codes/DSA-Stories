public class CalculateDigitSumOfString {
    public static void main(String[] args) {
        String s="11111222223";
        int k=3;
        System.out.println(digitSum(s, k));
    }
    public static String digitSum(String s, int k) {
        String res="";
         if(s.length()<=k){
             return s;
         }
 
            
         for(int i=0;i<s.length();i+=k){
          if((i+k)>=s.length()){
              res+=sum(s.substring(i));
          } 
          else{
              res+=sum(s.substring(i,i+k));
             
          }
         }
     
 return digitSum(res,k);     
     }
   public static String sum(String s){
         char[] ch=s.toCharArray();
         int sum=0;
      for(int i=0;i<ch.length;i++){
          sum+=ch[i]-'0';
      }
      String res=Integer.toString(sum);
         return res;
     }
}

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s="The sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] tmp=new String[countWords(s)];
          s=s.trim();
         s=s+' ';
         int k=0;
          String tempStr="";
          String res="";
          for(int i=0;i<s.length()-1;i++){
              if(s.charAt(i)!=' ' && s.charAt(i+1)==' '){
                  tempStr+=s.charAt(i);
                  tempStr=tempStr.trim();
                  tmp[k]=tempStr;
                  k++;
                  tempStr="";
              }
              else if(s.charAt(i)!=' '){
                  tempStr+=s.charAt(i);
              }
              else{
                  continue;
              }
              
          }
  for(int i=tmp.length-1;i>=0;i--){
      res+=tmp[i]+" ";
  }
  res=res.trim();
  return res;
      }
          public static int countWords(String s){
          s=s.trim();
          s=' '+s;
          int k=0;
          for(int i=0;i<s.length();i++){
              if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                  k++;
              }
          }
          return k;
      }
}

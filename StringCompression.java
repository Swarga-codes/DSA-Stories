public class StringCompression {
    public static void main(String[] args) {
        char[] ch={'a','a','b','b','c','c','c'};
         System.out.println(compress(ch)); 
    }
    public static int compress(char[] ch) {
        int count=1;
      String res="";
      if(ch.length==1){
          return 1;
      }
  for(int i=0;i<ch.length-1;i++){
      if(ch[i]==ch[i+1]){
          count=count+1;
      }
      if((i+1)==ch.length-1 && ch[i+1]==ch[i]){
          if(count>1){
          res+=ch[i]+""+count;
          }
          else{
            res+=ch[i]+"";  
          }
          break;
      }
      else if(ch[i]!=ch[i+1]){
          if((i+1)==ch.length-1){
                if(count>1){
          res+=ch[i]+""+count+ch[i+1];
          count=1;
         }
         else{
           res+=ch[i]+""+ch[i+1];
           count=1;
         }
         break;
          }
          else{
         if(count>1){
          res+=ch[i]+""+count;
          count=1;
         }
         else{
           res+=ch[i]+"";
           count=1;
         }
          }
          
      }
      
  }
for(int i=0;i<res.length();i++){
  ch[i]=res.charAt(i);
}
  return res.length();
}
}

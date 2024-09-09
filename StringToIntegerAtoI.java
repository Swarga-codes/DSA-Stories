class StringToIntegerAtoI{
    public static void main(String[] args) {
        String s="-42 and 0";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        s=s.trim();
       if(s.length()==0) return 0;
      
       boolean isPositive=true;
       long res=0;
       if(s.charAt(0)=='-'){
           isPositive=false;
       }
       for(int i=0;i<s.length();i++){
           if(i==0 && (s.charAt(i)=='-' || s.charAt(i)=='+')){
               continue;
           }
           if((s.charAt(i)-'0')>=0 && (s.charAt(i)-'0')<=9){
               
               res=res*10+(s.charAt(i)-'0');
               if(res>Integer.MAX_VALUE){
                   if(isPositive){
                       return Integer.MAX_VALUE;
                   }
                   else{
                       return Integer.MIN_VALUE;
                   }
                   
               }
           }
           else{
               break;
           }
       }
       if(isPositive){
           return (int)res;
       }
       return (int)res*(-1);
   }
}
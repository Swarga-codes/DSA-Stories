public class CountAsterisks {
    public static void main(String[] args) {
        String s="I|am|a***|boy";
System.out.println(countAsterisks(s));
    }
    public static int countAsterisks(String s) {
        int k=0,count=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='|'){
               k++;
           }
          if(s.charAt(i)=='*' && k%2==0){
                   count++;
               }
        }
        return count;
    }
}

public class ReverseString {
    public static void main(String[] args) {
        char[] ch={'h','e','l','l','o'};
        reverseString(ch);
        System.out.println(ch);
    }
    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            swap(s,i,s.length-1-i);
        }
     }
     public static void swap(char[] s,int p1,int p2){
         char tmp=s[p1];
         s[p1]=s[p2];
         s[p2]=tmp;
     }
}

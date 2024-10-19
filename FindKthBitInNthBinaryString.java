/**
 * FindKthBitInNthBinaryString
 */
public class FindKthBitInNthBinaryString {
public static void main(String[] args) {
    int n=3,k=1;
    System.out.println(findKthBit(n, k));
}
    public static char findKthBit(int n, int k) {
        StringBuilder s=new StringBuilder("0");
        for(int i=2;i<=n;i++){
            StringBuilder invert=new StringBuilder(invert(s.toString()));
            StringBuilder tmp=new StringBuilder(s);
            s=new StringBuilder();
            s.append(tmp);
            s.append(1);
            s.append(invert.reverse());
          
        }
        return s.toString().charAt(k-1);
    }
    public static String invert(String s){
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                ch[i]='1';
            }
            else{
                ch[i]='0';
            }

        }
        return new String(ch);
    }
}
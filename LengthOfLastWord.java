public class LengthOfLastWord {
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int k=0;
        int ind=s.lastIndexOf(' ');
        while(ind!=s.length()-1){
            k++;
            ind++;
        }
        return k;
    }
}

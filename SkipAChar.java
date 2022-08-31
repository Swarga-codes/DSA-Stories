///Iterative approach to skip a character in string
public class SkipAChar {
    public static void main(String[] args) {
        String s="Markus";
        System.out.println(Skip(s));
    }
    static String Skip(String s){
        String newString="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'){
                newString+=s.charAt(i);
            }
            else{
                continue;
            }
        }
        return newString;
    }
}

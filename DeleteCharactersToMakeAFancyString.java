public class DeleteCharactersToMakeAFancyString {
public static void main(String[] args) {
    String s="leeetcode";
    System.out.println(makeFancyString(s));
}
    public static String makeFancyString(String s) {
        int counter=1;

        StringBuilder res=new StringBuilder(s.charAt(0)+"");
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                if(counter>=2){
                    continue;
                }
                else{
                    counter++;
                    res.append(s.charAt(i));
                }
            }
            else{
                if(counter>2){
                    continue;
                }
                else{
                     res.append(s.charAt(i));
                }
                counter=1;
            }
        }
        return res.toString();
    }
}
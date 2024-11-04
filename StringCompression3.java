public class StringCompression3 {
public static void main(String[] args) {
    String word="abcde";
    System.out.println(compressedString(word));
}
    public static String compressedString(String word) {
        int counter=1;
        word+=" ";
        String comp="";
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                counter++;
            }
            else{
                if(counter>9){
                    while(counter!=0){
                        if(counter<9){
                            comp+=counter+""+word.charAt(i);
                            break;
                        }
                        else{
                             comp+="9"+word.charAt(i);
                             counter-=9;
                        }
                    }
                }
                else{
                    comp+=counter+""+word.charAt(i);
                }
                counter=1;
            }
        }
        return comp;
    }
}
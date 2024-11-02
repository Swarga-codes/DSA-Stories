/**
 * CircularSentence
 */
public class CircularSentence {

    public static void main(String[] args) {
        String s="leetcode exercises sound delightful";
        System.out.println(isCircularSentence(s));
    }
    public static boolean isCircularSentence(String sentence) {
        int n=sentence.length()-1;
        if(sentence.charAt(0)!=sentence.charAt(n)){
            return false;
        }
        sentence+=" ";
        char last=sentence.charAt(0);
        for(int i=0;i<sentence.length()-1;i++){
            if(sentence.charAt(i)!=' ' && sentence.charAt(i+1)==' '){
                last=sentence.charAt(i);
            }
            if(sentence.charAt(i)==' ' && sentence.charAt(i+1)!=' '){
                if(last!=sentence.charAt(i+1)){
                    return false;
                }
            }
    
        }
        return true;
    }
}
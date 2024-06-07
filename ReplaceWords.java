import java.util.*;

public class ReplaceWords {
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary, sentence));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        sentence+=" ";
        List<String> words=new ArrayList<>();
        int start=0,end=0;
       for(int i=0;i<sentence.length()-1;i++){
        if(sentence.charAt(i)!=' ' && sentence.charAt(i+1)==' '){
            end=i+1;
            words.add(replaceWithRoot(sentence.substring(start,end),dictionary)+" ");
            start=end+1;
        }
       }
       StringBuilder str=new StringBuilder();
       for(int i=0;i<words.size();i++){
        str.append(words.get(i));
       }
       return str.toString().substring(0,str.length()-1);
       
        
    }
    public static String replaceWithRoot(String s,List<String> dictionary){
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<dictionary.size();i++){
            if(s.startsWith(dictionary.get(i))){
                if(minLen>dictionary.get(i).length()){
                s=dictionary.get(i);
                minLen=dictionary.get(i).length();
                }
            }
        }
        return s;
    }
}

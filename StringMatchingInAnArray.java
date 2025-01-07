import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
public static void main(String[] args) {
    String[] words={"mass","as","hero","superhero"};
    System.out.println(stringMatching(words));
}
     public static List<String> stringMatching(String[] words) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].equals(words[j])){
                    continue;
                }
                if(words[j].length()<words[i].length()){
                    continue;
                }
                if(!res.contains(words[i]) && words[j].indexOf(words[i])!=-1){
                    res.add(words[i]);
                }
            }
        }
        return res;
    }
}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph="Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned={"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph+=" ";
        paragraph=paragraph.toLowerCase();
        String[] tmp=paragraph.split(",");
        paragraph=String.join(" ",tmp);
        List<String> words=new ArrayList<>();
        List<String> ban=new ArrayList<>();
        HashMap<String, Integer> map=new HashMap<>();
        int start=0;
        int max=0;
        String res="";
        for(int i=0;i<paragraph.length()-1;i++){
            if(paragraph.charAt(i)==' ' && paragraph.charAt(i+1)!=' '){
                start=i+1;
            }
            
            if(paragraph.charAt(i)!=' ' && paragraph.charAt(i+1)==' '){
                if(!(paragraph.charAt(i)>='a' && paragraph.charAt(i)<='z')){
                    words.add(paragraph.substring(start,i).trim());
                }
                else{
                words.add(paragraph.substring(start,i+1).trim());
                }
            }
        }
        for(int i=0;i<banned.length;i++){
            ban.add(banned[i]);
        }

        for(int i=0;i<words.size();i++){
            if(ban.contains(words.get(i))){
                continue;
            }
            if(map.containsKey(words.get(i))){
                map.put(words.get(i),map.get(words.get(i))+1);
            }
            else{
                map.put(words.get(i),1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                res=entry.getKey();
            }
        }
        return res;
    }
}

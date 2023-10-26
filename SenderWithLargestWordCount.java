import java.util.HashMap;
import java.util.Map;

public class SenderWithLargestWordCount {
    public static void main(String[] args) {
        String[] messages = {"Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"}, senders = {"Alice","userTwo","userThree","Alice"};
        System.out.println(largestWordCount(messages, senders));
    }
     public static String largestWordCount(String[] messages, String[] senders) {
        int[] messageLength=new int[messages.length];
        for(int i=0;i<messages.length;i++){
            messageLength[i]=countWords(messages[i]);
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<senders.length;i++){
            if(map.containsKey(senders[i])){
                map.put(senders[i],map.get(senders[i])+messageLength[i]);
            }
            else{
                map.put(senders[i],messageLength[i]);
            }
        }
        int max=Integer.MIN_VALUE;
        String res="";
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==max && res.compareTo(entry.getKey())<0){
                res=entry.getKey();
            }
            if(entry.getValue()>max){
                max=entry.getValue();
                res=entry.getKey();
            }
        }
        return res;
    }
    public static int countWords(String str){
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
}

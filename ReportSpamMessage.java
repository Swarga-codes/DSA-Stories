import java.util.*;
class ReportSpamMessage{
    public static void main(String[] args){
        String[] message={"hello","world","leetcode"},bannedWords={"world","hello"};
        System.out.println(reportSpam(message, bannedWords));
        
    }
    public static boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> set=new HashSet<>();
        int k=0;
        for(int i=0;i<bannedWords.length;i++){
            set.add(bannedWords[i]);
        }
        for(int i=0;i<message.length;i++){
            if(set.contains(message[i])){
                k++;
                if(k==2){
                    return true;
                }
            }
        }
        return false;
    }
}
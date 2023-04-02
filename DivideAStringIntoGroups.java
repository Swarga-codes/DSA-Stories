import java.util.*;
public class DivideAStringIntoGroups {
    public static void main(String[] args) {
        String s="abcdefghij";
        char fill='x';
        int k=3;
        System.out.println(Arrays.toString(divideString(s, k, fill)));
    }
    public static String[] divideString(String s, int k, char fill) {
        String temp="";
        List<String> list=new ArrayList<>();

        for(int i=0;i<s.length();i++){
        if((i+1)%k!=0){
            temp+=s.charAt(i);
            if(i==s.length()-1 && temp.length()<k){
                for(int j=temp.length();j<k;j++){
                    temp+=fill;
                }
                list.add(temp);
                break;
            }
        }
        else{
            temp+=s.charAt(i);
            list.add(temp);
            temp="";
            
        }
        }
        String[] str=new String[list.size()];
        for(int i=0;i<list.size();i++){
            str[i]=list.get(i);
        }
        return str;
    }
}

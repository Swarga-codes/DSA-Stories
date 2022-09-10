import java.util.ArrayList;

public class PhoneNumber {
    public static void main(String[] args) {
        String str="12";
        System.out.println("The result is: ");
       Number("", str);// void function call
       System.out.println("The result in the form of an ArrayList is: ");
       System.out.println(NumList("", str));// arraylist function call
       System.out.println("The number of possible outputs are : ");
       System.out.println(NumCount("", str));//function that returns the count of output
    }
    //function that returns the combinations
    static void Number(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digits= up.charAt(0)-'0';
        for (int i = (digits-1)*3; i < digits*3; i++) {
            char ch=(char)('a'+i);
            Number(p+ch, up.substring(1));
        }
    }
    //function that returns the value as an arraylist
    static ArrayList<String> NumList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> li=new ArrayList<>();
        int digits=up.charAt(0) -'0';
        for(int i=(digits-1)*3;i<digits*3;i++){
            char ch=(char)('a'+i);
            li.addAll(NumList(p+ch, up.substring(1)));
        }
        return li;
    }
    //function that returns the possible substrings
    static int NumCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int k=0;
        int digits= up.charAt(0)-'0';
        for (int i = (digits-1)*3; i < digits*3; i++) {
            char ch=(char)('a'+i);
           k=k+NumCount(p+ch, up.substring(1));
        }
        return k;
    }
}

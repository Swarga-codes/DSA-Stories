import java.util.*;
public class SubsequenceArrayList {
    public static void main(String[] args) {
       System.out.println(SubArList("", "abc")); 
    }
    public static ArrayList<String> SubArList(String p,String up){
        if(up.isEmpty()){
         ArrayList<String> list=new ArrayList<>();
         list.add(p);   
         return list;
        }
        char ch=up.charAt(0);
        
        ArrayList<String> left= SubArList(p+ch, up.substring(1));
        ArrayList<String> right= SubArList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}

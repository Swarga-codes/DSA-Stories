import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
       System.out.println(lmao("","abc")); 
    }
    static ArrayList<String> lmao(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=lmao(p+ch,up.substring(1));
        ArrayList<String> right=lmao(p,up.substring(1));
   left.addAll(right);
   return left;
    }
}

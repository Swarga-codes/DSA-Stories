import java.util.ArrayList;

// import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
       permute("","abc"); 
       System.out.println(permutateStr("", "abc"));
    }
    static void permute(String p,String up){
        if(up.isEmpty()){
        System.out.println(p);
        return;
       }
       char ch=up.charAt(0);
       
       for(int i=0;i<=p.length();i++){
        String f=p.substring(0,i);
        String e=p.substring(i, p.length());
        permute(f+ch+e, up.substring(1));
       }
    }
    static ArrayList<String> permutateStr(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
        String f= p.substring(0, i);
        String e= p.substring(i,p.length());
        ans.addAll(permutateStr(f+ch+e, up.substring(1))); 
    }
    
    return ans;
    }
}

import java.util.ArrayList;

public class PermutationInOne {
    public static void main(String[] args) {
        String s="abc";
        System.out.println("The permutations are as follows: ");
permute("", s); // function that prints the permutations possible
System.out.println("The number of possible permutations are: ");
System.out.println(permuteCount("", s)); //function that is called to return the number of possible permutations
System.out.println("The permutations displayed as an ArrayList: ");
System.out.println(permuteList("", s));   //function that displays the permutations in an arraylist
}
    //void function to print the possible pemutations
    static void permute(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
        }
        for(int i=0;i<up.length();i++){
            char ch=up.charAt(i);
        String left=up.substring(0, i);
        String right=up.substring(i+1);
        String combo=left+right;
        permute(p+ch, combo);
        }

    }
    // function that returns the number of permutations possible
    static int permuteCount(String p, String up){
     int count=0;
        if(up.isEmpty()){
            return 1;
        }
        for(int i=0;i<up.length();i++){
            char ch=up.charAt(i);
        String left=up.substring(0, i);
        String right=up.substring(i+1);
        String combo=left+right;
        count+= permuteCount(p+ch,combo);
        }
        return count;
    }
    // returning permutations using arraylist
    static ArrayList<String> permuteList(String p,String up){
        if(up.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
          list.add(p);
          return list;
        }
        ArrayList<String> ans=new ArrayList<>();
    

        for(int i=0;i<up.length();i++){
            char ch=up.charAt(i);
       String left= up.substring(0, i);
    String right= up.substring(i+1);
    String combo=left+right;
        ans.addAll(permuteList(p+ch, combo));
    }
    return ans;
}
}

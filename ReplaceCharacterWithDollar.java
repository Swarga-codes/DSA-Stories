import java.util.Scanner;
public class ReplaceCharacterWithDollar {
    public static String ReplaceCharacter(String s){
        int l=s.length();
        String res="";
        String d="";
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='o' || ch=='O'){
            d+="$";
            res=res+d;
             
            }
            else{
            res=res+ch;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ReplaceCharacter(s));
    }
}

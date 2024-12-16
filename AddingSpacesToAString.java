public class AddingSpacesToAString {
    public static void main(String[] args) {
        String s="LeetcodeHelpsMeLearn";
        int[] spaces={8,13,15};
        System.out.println(addSpaces(s, spaces));
    }
    public static String addSpaces(String s, int[] spaces) {
        int k=0;
        StringBuilder res=new StringBuilder("");
        if(spaces[k]==0){
            res.append(" ");
            k++;
        }
        for(int i=0;i<s.length();i++){
            if(k<spaces.length && i+1==spaces[k]){
                res.append(s.charAt(i)+" ");
                k++;
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}

public class SkipACharRecurse {
    public static void main(String[] args) {
        skip("","bbacdb");
       System.out.println(skip2("bbacdb")); 
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
        return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }

    static String skip2(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            return skip2(s.substring(1));
        }
        else{
           return ch+skip2(s.substring(1));
        }
    }
}

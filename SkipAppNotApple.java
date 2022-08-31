public class SkipAppNotApple {
    public static void main(String[] args) {
        System.out.println(AppNotApple("bccjdkapplppp"));
    }
    static String AppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && s.startsWith("apple")!=true){
            return AppNotApple(s.substring(3));
        }
        else{
            return s.charAt(0)+AppNotApple(s.substring(1));
        }

    }
}

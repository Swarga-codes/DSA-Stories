import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class JavaRegularExpression {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("good",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher("good");
        boolean isMatched= matcher.find();
        if(isMatched){
            System.out.println("Match Found !");
        }
        else{
            System.out.println("No Match!!");
        }
    }
}

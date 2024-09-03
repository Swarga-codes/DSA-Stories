
public class LargestOddNumberInString{
    public static void main(String[] args) {
        String num="32336";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
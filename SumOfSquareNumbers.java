public class SumOfSquareNumbers {
    public static void main(String[] args) {
        int c=5;
        System.out.println(judgeSquareSum(c));
    }
    public static boolean judgeSquareSum(int c) {
        long l=0,h=(int)Math.sqrt(c);
        long req;
        while(l<=h){
            req=l*l+h*h;
            if(req==c){
                return true;
            }
            else if(req>c){
                h--;
            }
            else{
                l++;
            }
        }
        return false;
    }
}

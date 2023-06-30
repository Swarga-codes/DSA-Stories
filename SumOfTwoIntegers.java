public class SumOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(getSum(3, 4));
    }
     public static int getSum(int a, int b) {
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        return (int)Math.log(Math.exp(a)*Math.exp(b));
    }
}

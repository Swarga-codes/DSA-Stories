public class AddDigits {
    public static void main(String[] args) {
        int num=25;
        System.out.println(addDigits(num));
    }
    public static int addDigits(int num) {
        if(num<10){
            return num;
        }
        int tmp=num;
        int sum=0,d=0;
        while(tmp!=0){
            d=tmp%10;
            sum=sum+d;
            tmp=tmp/10;
        }
        return addDigits(sum);
      }
}

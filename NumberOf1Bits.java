public class NumberOf1Bits {
    public static void main(String[] args) {
        int n=0b00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        String tmp=Integer.toBinaryString(n);
        int k=0;
        for(int i=0;i<tmp.length();i++){
            if(tmp.charAt(i)=='1'){
                k++;
            }
        }
        return k;
        }
}

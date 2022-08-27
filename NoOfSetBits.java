public class NoOfSetBits {
    public static void main(String[] args) {
        int n=9,k=0;
        while(n>0){
            if((n&1)==1){
                k++;
            }
            n=n>>1;
        }
        System.out.println("The number of set bits are : "+k);
    }
}

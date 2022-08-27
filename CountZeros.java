public class CountZeros {
    public static void main(String[] args) {
        System.out.println(Count(23300));
    }
    static int Count(int n){
        int k=0,d=0;
     if(n==0){
        return 1;
     }
    if(n>0 && n<10){
        return 0;
    }
        d=n%10;
        if(d==0){
            k++;
        }
        return k+Count(n/10);
     
 
    }
}

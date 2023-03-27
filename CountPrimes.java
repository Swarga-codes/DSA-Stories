public class CountPrimes {
    public static void main(String[] args) {
        int num=10;
        System.out.println(countPrimes(num));
    }
    public static int countPrimes(int n) {
        if(n==0|| n==1|| n==2){
            return 0;
        }
       
        int k=0;
        boolean[] arr=new boolean[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==true){
                k++;
            }
        }
        return k;
    }
}

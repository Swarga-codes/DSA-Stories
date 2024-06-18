public class FindNthRootOfM {
    public static void main(String[] args) {
        int n=2,m=9;
        System.out.println(NthRoot(n, m));
    }
    public static int NthRoot(int n, int m)
    {
        // code here
       int low=0,high=m,mid;
       while(low<=high){
           mid=(low+high)/2;
           if(Math.pow(mid,n)==m) return mid;
           else if(Math.pow(mid,n)>m)high=mid-1;
           else low=mid+1;
       }
        return -1;
    }
}

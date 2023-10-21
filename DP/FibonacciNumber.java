package DP;
import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fib(n));
    }
     public static int fib(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return getAns(n,dp);
    }
    public static int getAns(int n,int[] dp){
        if(n<2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=getAns(n-1,dp)+getAns(n-2,dp);
        return dp[n];
    }
}

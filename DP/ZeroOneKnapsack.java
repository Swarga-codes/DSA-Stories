package DP;

import java.util.Arrays;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int[] wt={4,5,1},val={1,2,3};
        int W=4,n=3;
        System.out.println(knapSack(W, wt, val, n));
    }
        static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
       int[][] dp = new int[n+1][W+1];
  
for (int i = 0; i < dp.length; i++) {
    Arrays.fill(dp[i], -1);

}
return findKnapSack(W,wt,val,n,dp);
    }
    static int findKnapSack(int W, int wt[], int val[], int n,int[][] dp){
        if(n==0 || W==0){
             return 0;
         }
         if(dp[n][W]!=-1){
             return dp[n][W];
         }
         if(wt[n-1]<=W){
             dp[n][W]=Math.max(val[n-1]+findKnapSack(W-wt[n-1],wt,val,n-1,dp),findKnapSack(W,wt,val,n-1,dp));
             return dp[n][W];
         }
         dp[n][W]=findKnapSack(W,wt,val,n-1,dp);
         return dp[n][W];   
    } 
}

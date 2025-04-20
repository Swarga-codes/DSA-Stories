public class MaximumPointYouCanObtainFromCards {
    public static void main(String[] args) {
        int[] cardPoints={1,2,3,4,5,6,1};
        int k=3;
        System.out.println(maxScore(cardPoints,k));
    }
    public static int maxScore(int[] cardPoints, int k) {
        int r=cardPoints.length-1,curr=0,res=0;
       for(int i=0;i<k;i++){
        curr+=cardPoints[i];
       }
       res=Math.max(res,curr);
       while(k>0){ 
        curr-=cardPoints[k-1];
        k--;
        curr+=cardPoints[r];
        r--;
        res=Math.max(res,curr);
       }

return res;
    }
}
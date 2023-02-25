public class BestTimetoBuySell {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length==0 || prices.length==1){
            return 0;
        }
        int maxVal=0;
        int minVal=Integer.MAX_VALUE;
     for(int i=0;i<prices.length;i++){
        minVal=Math.min(minVal,prices[i]);
        maxVal=Math.max(maxVal,prices[i]-minVal);
     }
     return maxVal;
       
}
}

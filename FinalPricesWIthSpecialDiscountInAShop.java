import java.util.Arrays;

public class FinalPricesWIthSpecialDiscountInAShop {
    public static void main(String[] args) {
        int[] prices={8,4,6,2,3};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }
    public static int[] finalPrices(int[] prices) {
        int[] ans=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            boolean flag=false;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    flag=true;
                    ans[i]=prices[i]-prices[j];
                    break;
                }
            }
            if(!flag){
               ans[i]=prices[i];
            }
           
        }
        return ans;
        
       
    }
}
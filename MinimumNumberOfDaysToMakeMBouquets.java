public class MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3, k = 1;
        System.out.println(minDays(bloomDay, m, k));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if(k>bloomDay.length || (long)m*k>bloomDay.length) return -1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
       int l=min,h=max,mid;
       while(l<=h){
        mid=(l+h)/2;
        if(getAns(bloomDay,m,k,mid)){
            h=mid-1;
        }
        else{
            l=mid+1;
        }
       }
       return l;
    
    }
    public static boolean getAns(int[] bloomDays,int m,int k,int boundary){
        int curr=0,bouquets=0;
        for(int i=0;i<bloomDays.length;i++){
            if(bloomDays[i]<=boundary){
                curr++;
            }
            else{
                bouquets+=(curr/k);
                curr=0;
            }
        }
        bouquets+=(curr/k);
        return bouquets>=m;
    }
}

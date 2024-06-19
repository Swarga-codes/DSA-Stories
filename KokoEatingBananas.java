public class KokoEatingBananas {
    public static void main(String[] args) {
       int[] piles = {3,6,7,11};
       int h = 8;
       System.out.println(minEatingSpeed(piles, h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
    int low=1,high=max,mid;
    while(low<=high){
        mid=(low+high)/2;
        if(getAns(piles,mid,h)){
            
            high=mid-1;

        }
        else{
            low=mid+1;
        }
    }
    return low;
    }
    public static boolean getAns(int[] piles,int possibleAns,int h){
        int k=0;
        for(int i=0;i<piles.length;i++){
            k+=Math.ceil((double)piles[i]/possibleAns);
        }
        return k<=h;
    }
}

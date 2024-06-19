public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(shipWithinDays(weights, days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        int low=1,high=sum,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(possibleAns(weights,mid,days)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static boolean possibleAns(int[] weights,int capacity,int days){
        int k=0,currSum=0;
        for(int i=0;i<weights.length;i++){
            currSum+=weights[i];
            if(weights[i]>capacity){
                return false;
            }
            if(currSum==capacity){
                k++;
                currSum=0;
            }
            if(currSum>capacity){
                k++;
                currSum=weights[i];
            }
        }
        if(currSum>0 && currSum<=capacity){
            k++;
        }
        return k<=days;
    }
}

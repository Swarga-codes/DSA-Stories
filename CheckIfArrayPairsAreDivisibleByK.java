import java.util.*;
class CheckIfArrayPairsAreDivisibleByK{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,10,6,7,8,9};
        int k=5;
        System.out.println(canArrange(arr,k));
    }
    public static boolean canArrange(int[] arr, int k) {
        Map<Integer,Integer> remCount=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem=((arr[i]%k)+k)%k;
            remCount.put(rem,remCount.getOrDefault(rem,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            int rem=((arr[i]%k)+k)%k;
            if(rem==0){
                if(remCount.get(rem)%2==1){
                    return false;
                }
            }
            
                else if(!Objects.equals(remCount.get(rem),remCount.get(k-rem))){
                    return false;
                }
            
        }
        return true;
    }
}
public class MinimumNumberOfConsecutiveKBitFlips {
    public static void main(String[] args) {
        int[] nums={0,0,0,1,0,1,1,0};
        int k=3;
        System.out.println(minKBitFlips(nums, k));
    }
    public static int minKBitFlips(int[] nums, int k) {
        int i=0,n=nums.length,ans=0,flipped=0;
        int[] flippedArr=new int[n];
        while(i<n){
          if(i>=k){
            flipped^=flippedArr[i-k];
          }
          if((flipped^nums[i])==0){
            if(i+k-1>=n){
                return -1;
            }
            ans++;
            flippedArr[i]=1;
            flipped^=1;
          
          }

            i++;
            
        }
        return ans;
    }
}

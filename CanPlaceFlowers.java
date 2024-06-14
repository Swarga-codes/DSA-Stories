public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
    public static boolean canPlaceFlowers(int[] nums, int n) {
        if(nums.length==1){
            if(nums[0]==0 && n<=1){
                return true;
            }
            else if(nums[0]==1 && n==1){
                return false;
            }
          else{
            return true;
          }
        }
         if(nums[0]==0 && nums[1]==0){
            n--;
            nums[0]=1;
        }
         if(nums[nums.length-1]==0 && nums[nums.length-2]==0){
            n--;
            nums[nums.length-1]=1;
        }
        if(n<1) return true;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]==0 && nums[i+1]==0 && nums[i]!=1){
                n--;
                nums[i]=1;
            }
            if(n==0) return true;
        }
       
       
        return false;
    }
}

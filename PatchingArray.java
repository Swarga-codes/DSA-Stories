public class PatchingArray {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        int n=4;
        System.out.println(minPatches(nums, n));
    }
    public static int minPatches(int[] nums, int n) {
        long maxReach=0;
        int patch=0,i=0;
        while(maxReach<n){
            if(i<nums.length && nums[i]<=(maxReach+1)){
                maxReach+=nums[i];
                i++;
            }
            else{
                maxReach+=(maxReach+1);
                patch++;
            }
        }
        return patch;
    }
}

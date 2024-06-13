public class NumberOfOccurence {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,2,3};
        int n=nums.length;
        int x=2;
        System.out.println(count(nums, n, x));
    }
    static int count(int[] nums, int n, int x) {
        // code here
         int low=0,high=nums.length-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==x){
                if((mid-1)>=0 && (mid+1)<nums.length && nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                    return 1;
                }
                else{
                    int i=mid,j=mid;
                    while(i>=0 && nums[i]==nums[mid]){
                        i--;
                    }
                    i++;
                    while(j<nums.length && nums[j]==nums[mid]){
                        j++;
                    }
                    j--;
                    return j-i+1;
                }
            }
            else if(nums[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
         return 0;
    }
}

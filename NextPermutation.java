import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
       int[] nums={3,2,1};
       nextPermutation(nums);
       System.out.println(Arrays.toString(nums)); 
    }

    // ALgorithm
    /*
     * Traverse from the back of the array such that arr[i]<arr[i+1] here i is the dipping point.
     * Now break the loop and check if we get the dipping point or not if not then we just reverse the array and return it
     * Now in case we find the dipping point we start to examine the back of the array till the dipping point 
     * Here we get the element that has the least difference between the dipping point that is greater than 0 element since the array after the dipping index is
     * already sorted in decreasing order.
     * Now we swap this element with the dipping element
     * And then we sort the index from dipping point + 1 to the remaining array in ascending order
     * In short we just need to reverse it since it was already sorted in decreasing order 
     */
    public static void nextPermutation(int[] nums) {
        if(nums.length==1) return;
        int findDip=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                findDip=i;
                break;
            }
        }
        if(findDip==-1){
          reverse(nums,0,nums.length);
            return;
        }
        for(int i=nums.length-1;i>=findDip+1;i--){
           if(nums[findDip]<nums[i]){
             int tmp=nums[findDip];
        nums[findDip]=nums[i];
        nums[i]=tmp;
        break;
           }
        }
       
    reverse(nums,findDip+1,nums.length);

    }
    public static void reverse(int[] nums,int start,int end){
        int i=start, j=end-1;
        while(i<=j){
            int tmp=nums[i];
            nums[i]=nums[j];
            nums[j]=tmp;
            i++;
            j--;
        }
    }
}

import java.util.*;
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        if(nums.length<2) return nums;
        int i=0,j=nums.length-1;
       while(i<=j){
        if(nums[j]%2==0){
            if(nums[i]%2!=0){
                swap(nums,i,j);
                i++;
                j--;
            }
            else{
                i++;
            }
        }
        else{
            j--;
        }
       }
        return nums;
    }
    public static void swap(int[] nums,int first,int second){
        int tmp=nums[first];
        nums[first]=nums[second];
        nums[second]=tmp;
    }
}

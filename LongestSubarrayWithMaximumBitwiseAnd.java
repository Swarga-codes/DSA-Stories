public class LongestSubarrayWithMaximumBitwiseAnd {
public static void main(String[] args) {
    int[] nums={1,2,3,3,2,2};
    System.out.println(longestSubarray(nums));
}
public static int longestSubarray(int[] nums) {
    int max=nums[0];
    for(int i=0;i<nums.length;i++){
        if(max<nums[i]){
            max=nums[i];
        }
    }
    int count=1;
    int maxC=1;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==max && nums[i+1]==max){
            count++;
        }
        else{
            if(count>maxC){
                maxC=count;
            }
            count=1;
        }
    }
    if(count>maxC){
        return count;
    }
    return maxC;
    
}
    
}
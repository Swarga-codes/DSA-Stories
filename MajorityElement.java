public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={5,5,7,3,1,5,7,5,5,5,5};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        //Moore's voting algorithm
        /*Note: Moore algo initially picks up an element and assumes it as the result and increments the count everytime 
          it hits the same element and reduces the count everytime it doesn't hit the same element. When the count reaches 0
          it reinitializes and assumes the next element as the ans and the same process occurs till we reach the end of the array
          and finally return the ans variable.
         */
        int ans=nums[0],count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                count++;
            }
            else if(ans!=nums[i]){
                count--;
            }
        }
        return ans;
    }
}

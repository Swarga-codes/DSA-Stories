import java.util.ArrayList;
import java.util.List;

public class MajorityElement2Optimized {
    public static void main(String[] args) {
        int[] nums={1,2,1,1,2,2,4};
        System.out.println(majorityElement(nums));
    }
     public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int count1=0,element1=0,element2=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=element2){
                count1=1;
                element1=nums[i];
            }
            else if(count2==0 && nums[i]!=element1){
                count2=1;
                element2=nums[i];
            }
            else if(nums[i]==element1){
                count1++;
            }
            else if(nums[i]==element2){
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element1) {
                count1++;
            }
            else if(nums[i]==element2){
                count2++;
            }
        }
        if(count1>nums.length/3) ans.add(element1);
        if(count2>nums.length/3) ans.add(element2);
        return ans;
    }
}

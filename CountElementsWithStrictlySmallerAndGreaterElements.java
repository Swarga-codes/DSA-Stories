import java.util.Arrays;

public class CountElementsWithStrictlySmallerAndGreaterElements {
    public static void main(String[] args) {
        int[] nums={11,7,2,15};
        System.out.println(countElements(nums));
    }
     public static int countElements(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        for(int i=1;i<nums.length-1;i++){
                if(nums[i]==nums[0] || nums[i]==nums[nums.length-1]){
                    continue;
                }
                k++;
        }
        return k;
    }
}

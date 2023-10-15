import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
     public static int[] createTargetArray(int[] nums, int[] index) {
        int[] res=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<index.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}

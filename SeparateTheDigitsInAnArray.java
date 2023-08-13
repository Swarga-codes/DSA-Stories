import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateTheDigitsInAnArray {
    public static void main(String[] args) {
       int[] nums={13,25,83,77};
       System.out.println(Arrays.toString(separateDigits(nums))); 
    }
    public static int[] separateDigits(int[] nums) {
        String tmp="";
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            tmp=nums[i]+"";
            for(int j=0;j<tmp.length();j++){
                list.add(Integer.parseInt(tmp.charAt(j)+""));
            }
            tmp="";
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}

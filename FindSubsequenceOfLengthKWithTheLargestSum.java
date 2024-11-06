import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSubsequenceOfLengthKWithTheLargestSum {
public static void main(String[] args) {
    int[] nums={2,1,3,3};
    int k=2;
    System.out.println(Arrays.toString(maxSubsequence(nums, k)));
}
        public static int[] maxSubsequence(int[] nums, int k) {
        boolean[] checked=new boolean[nums.length];
        List<Element> list=new ArrayList<>();
        for(int i=1;i<=k;i++){
            int max=Integer.MIN_VALUE;
            int idx=0;
            for(int j=0;j<nums.length;j++){
                if(!checked[j]){
                    if(max<nums[j]){
                        max=nums[j];
                        idx=j;
                    }
                   
                }
            }
            list.add(new Element(max,idx));
            checked[idx]=true;
        }
        Collections.sort(list,(a,b)->a.idx-b.idx);
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i).value;
        }
        return res;
    }
}
class Element{
    int value;
    int idx;
    Element(int value,int idx){
        this.value=value;
        this.idx=idx;
    }
}
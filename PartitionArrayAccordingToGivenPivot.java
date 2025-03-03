import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArrayAccordingToGivenPivot {
    public static void main(String[] args) {
        int[] nums={9,12,5,10,14,3,10};
        int pivot=10;
        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
    }
     public static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small=new ArrayList<>();
        List<Integer> greater=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                count++;
            }
            else if(nums[i]>pivot){
                greater.add(nums[i]);
            }
            else{
                small.add(nums[i]);
            }
        }
        int k=0;
        for(int i=0;i<small.size();i++){
            nums[k++]=small.get(i);
        }
        for(int i=0;i<count;i++){
            nums[k++]=pivot;
        }
        for(int i=0;i<greater.size();i++){
            nums[k++]=greater.get(i);
        }
        return nums;
    }
}

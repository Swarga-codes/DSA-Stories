import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
       int[] arr={1,2,1,0};
       System.out.println(longestConsecutive(arr)); 
    }
     public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size()<2) return set.size();
        int k=1,max=Integer.MIN_VALUE;
        for(int el: set){
            if(!set.contains(el-1)){
            int tmp=el;
            while(set.contains(tmp+1)){
                k++;
                tmp++;
            }
            max=Math.max(max,k);
            k=1;
            
        }
        }
        max=Math.max(max,k);
        return max;

    }
}

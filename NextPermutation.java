import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
       int[] nums={3,2,1};
       nextPermutation(nums);
       System.out.println(Arrays.toString(nums)); 
    }

    // ALgorithm
    // 1. Traverse from back and search for element such that arr[i]<arr[i+1]
    // 2. Once we get that store than in some variable, for instance pos1
    // 3. Now again traverse from back and find some element such that arr[i]>arr[pos1]
    // 4. Again store this value of current index in some variable, such as pos2
    // 5. Now swap the elements in these indices pos1 and pos2
    // 6. Now reverse all the elements starting from pos1 till the end of the array
    public static void nextPermutation(int[] nums) {
        int pos1=0,pos2=0;
    for(int i=nums.length-2;i>=0;i--){
                if(nums[i]<nums[i+1]){
                    pos1=i;
                    break;
                }
            }
            for(int i=nums.length-1;i>=0;i--){
                if(nums[pos1]<nums[i]){
                    pos2=i;
                    break;
                }
            }
        if(pos1==0 && pos2==0){
            int j=0,k=nums.length-1, tmp=0;
            while(j<=k){
                tmp=nums[j];
                nums[j]=nums[k];
                nums[k]=tmp;
                j++;
                k--;
            }
            return;
        }
            int tmp=nums[pos1];
            nums[pos1]=nums[pos2];
            nums[pos2]=tmp;
            int[] tmpArr=Arrays.copyOfRange(nums,pos1+1,nums.length);
            int k=tmpArr.length-1;
            for(int i=pos1+1;i<nums.length;i++){
                nums[i]=tmpArr[k--];
            }
}
}

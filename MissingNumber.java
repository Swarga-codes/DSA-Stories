public class MissingNumber {
    public int missingNumber(int[] nums) {
       
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i ){
                return i;
            } 
            } return nums.length;
        }
       

    

    static void sort(int arr[]){
        int i=0;

        while(i<arr.length){
            int check=arr[i];

            if(arr[i]<arr.length  && arr[i]!= arr[check]){
                int temp =arr[i];
                arr[i]= arr[check];
                arr[check]= temp;
            }
            else{
                i++;
            }
        }
    }
}
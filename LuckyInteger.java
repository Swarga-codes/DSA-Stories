public class LuckyInteger {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        int lucky=-1,k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    k++;
                }
            }
            if(arr[i]==k && arr[i]>lucky){
                lucky=arr[i];
            }
            k=0;
        }
        return lucky;
    }
}

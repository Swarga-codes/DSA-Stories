public class FindTheWinnerOfAnArrayGame {
    public static void main(String[] args) {
      int[] arr={2,1,3,5,4,6,7};
      int k=2;  
      System.out.println(getWinner(arr, k));
    }
    public static int getWinner(int[] arr, int k) {
        int currMax=arr[0];
        int winCount=0;
        for(int i=1;i<arr.length;i++){
            if(currMax<arr[i]){
                currMax=arr[i];
                winCount=1;
            }
            else if(currMax>arr[i]){
                winCount++;
            }
            if(winCount==k){
                return currMax;
            }
        }
        return currMax;
    }
}

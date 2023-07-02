public class NegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid={{4,3,-1,-3},{2,1,0,0}};
        System.out.println(countNegatives(grid));
    }
     public static int countNegatives(int[][] grid) {
        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=grid[0].length-1;j>=0;j--){
                if(grid[i][j]>=0){
                    break;
                }
                else{
                    k++;
                }
            }
        }
        return k;
    }
}

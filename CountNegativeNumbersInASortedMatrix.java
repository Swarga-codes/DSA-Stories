public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid={{3,2},{1,0}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int k=0;
        for(int i=grid[0].length-1;i>=0;i--){
            if(grid[0][i]<0){
                k+=grid.length;
            }
            else{
                int tmp=grid.length-1;
                while(grid[tmp][i]<0){
                    tmp--;
                    k++;
                }
            }
        }
       return k;
    }
}

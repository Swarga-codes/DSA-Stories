public class UniquePaths3 {
    public static void main(String[] args) {
        int[][] grid={{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        System.out.println(uniquePathsIII(grid));
    }
    public static int uniquePathsIII(int[][] grid) {
        int r=0,c=0,walkable=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    r=i;
                    c=j;
                }
                else if(grid[i][j]!=-1){
                    walkable++;
                }
            }
        }
        return solve(grid,r,c,walkable);
    }
    public static int solve(int[][] grid,int r,int c,int walkable){
        if(r>=grid.length || c>=grid[0].length || r<0 || c<0 || grid[r][c]==-1){
            return 0;
        }
        if(grid[r][c]==2) return walkable==0?1:0;
        walkable--;
        grid[r][c]=-1;
        
           int top=solve(grid,r-1,c,walkable);
       
           int bottom=solve(grid,r+1,c,walkable);
        
      
           int left=solve(grid,r,c-1,walkable);
        
        
          int right=solve(grid,r,c+1,walkable);
        
        grid[r][c]=0;
        walkable++;
        return left+right+bottom+top;

    }
}

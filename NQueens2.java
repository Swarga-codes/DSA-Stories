public class NQueens2 {
    public static void main(String[] args) {
        int n=4;
        System.out.println(totalNQueens(n));
    }
    public static int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        return solve(board,n,0);
    }
       public static int solve(char[][] board,int n,int row){
            int count=0;
            if(row==n){
                return 1;
            }
            for(int col=0;col<board.length;col++){
                if(isSafe(board,row,col)){
                    board[row][col]='Q';
                     count+=solve(board,n,row+1);
                    board[row][col]='.';
                }
            }
            return count;
    }
    public static boolean isSafe(char[][] board,int row,int col){
        for(int i=0;i<=row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        int j=row,k=col;
        while(j>=0 && k>=0){
            if(board[j][k]=='.'){
                j--;
                k--;
            }
            else{
                return false;
            }
        }
        j=row;
        k=col;
        while(j>=0 && k<board.length){
            if(board[j][k]=='.'){
                j--;
                k++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
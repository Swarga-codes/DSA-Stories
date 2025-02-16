import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);
        System.out.println(Arrays.deepToString(board));
    }
    public static void solveSudoku(char[][] board) {
        solve(board,0,0);   
       }
       public static boolean solve(char[][] board,int row,int col){
           if(row==board.length) return true;
           if(col==board.length) return solve(board,row+1,0);
           if(board[row][col]!='.') return solve(board,row,col+1);
           for(char c='1';c<='9';c++){
               if(isSafe(board,row,col,c)){
                   board[row][col]=c;
                   if(solve(board,row,col+1)){
                       return true;
                   }
                   board[row][col]='.';
               }
           }
           return false;
       }
       public static boolean isSafe(char[][] board,int row,int col,int c){
           for(int i=0;i<board.length;i++){
               if(board[row][i]==c) return false;
               if(board[i][col]==c) return false;
           }
           int r=row-row%3;
           int co=col-col%3;
           for(int i=r;i<r+3;i++){
               for(int j=co;j<co+3;j++){
                   if(board[i][j]==c) return false;
               }
           }
           return true;
       }
}

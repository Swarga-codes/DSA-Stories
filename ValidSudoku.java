public class ValidSudoku {
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
        System.out.println(isValidSudoku(board));
        
    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(!isRowSafe(board,i,j)){
                    return false;
                }
                if(!isColSafe(board,i,j)){
                    return false;
                }
                if(!isSubBoxSafe(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isRowSafe(char[][] board,int row,int col){
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='.'){
                continue;
            }
            if(i!=col && board[row][i]==board[row][col]){
                return false;
            }
        }
        return true;
    }
    public static boolean isColSafe(char[][] board,int row,int col){
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='.'){
                continue;
            }
            if(i!=row && board[i][col]==board[row][col]){
                return false;
            }
        }
        return true;
    }
    public static boolean isSubBoxSafe(char[][] board,int row,int col){
        int r=row-row%3;
        int c=col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(i!=row && j!=col && board[i][j]==board[row][col]){
                    return false;
                }
            }
        }
        return true;
    }
}

import java.util.*;
public class WordSearch {

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        System.out.println(exist(board, word));
    }
    public static boolean exist(char[][] board, String word) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(solve(board,i,j,0,word,set)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean solve(char[][] board,int row,int col,int i,String word,HashSet<String> set){
        if(i==word.length()){
            return true;
        }
        if(row>=board.length || col>=board[0].length || row<0 || col<0 || set.contains(row+""+col) || board[row][col]!=word.charAt(i)){
            return false;
        }
        set.add(row+""+col);
        boolean top=solve(board,row-1,col,i+1,word,set);
        boolean right=solve(board,row,col+1,i+1,word,set);
        boolean left=solve(board,row,col-1,i+1,word,set);
        boolean bottom=solve(board,row+1,col,i+1,word,set);
        set.remove(row+""+col);
        return top||right||left||bottom;
    }
}
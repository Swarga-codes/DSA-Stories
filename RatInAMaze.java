import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class RatInAMaze {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat=new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1, 0, 0, 0)));
        mat.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        mat.add(new ArrayList<>(Arrays.asList(1, 1, 0, 0)));
        mat.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));
        System.out.println(findPath(mat));
    }
    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        // code here
        int[][] board=new int[mat.size()][mat.size()];
        ArrayList<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat.size();j++){
                board[i][j]=mat.get(i).get(j);
            }
        }
        solve(board,res,sb,0,0,set);
        Collections.sort(res);
        return res;
    }
    public static void solve(int[][] board,ArrayList<String> res,StringBuilder sb,int row,int col,HashSet<String> set){
        if(row==board.length-1 && col==board.length-1){
            res.add(sb.toString());
            return;
        }
        if(set.contains(row+""+col) || board[row][col]==0) return;
        set.add(row+""+col);
        if(row>0){
            sb.append('U');
            solve(board,res,sb,row-1,col,set);
            sb.deleteCharAt(sb.length()-1);
        }
        if(col>0){
            sb.append('L');
            solve(board,res,sb,row,col-1,set);
            sb.deleteCharAt(sb.length()-1);
        }
        if(col<board.length-1){
            sb.append('R');
            solve(board,res,sb,row,col+1,set);
            sb.deleteCharAt(sb.length()-1);
        }
        if(row<board.length-1){
            sb.append('D');
            solve(board,res,sb,row+1,col,set);
            sb.deleteCharAt(sb.length()-1);
        }
        set.remove(row+""+col);
    }
}

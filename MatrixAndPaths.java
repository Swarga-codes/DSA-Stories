import java.util.Arrays;

public class MatrixAndPaths {
    public static void main(String[] args) {
    boolean[][] maze={
        {true,true,true},
        {true,true,true},
        {true,true,true}
    };
    int[][] paths=new int[maze.length][maze[0].length];
    pathsTrack("", 0, 0, maze, paths, 1);
    }
    static void pathsTrack(String p,int r,int c,boolean[][] maze,int[][] paths,int steps){
        if(r==maze.length-1 && c==maze[0].length-1){
            paths[r][c]=steps;
            for(int[] i:paths){
                System.out.println(Arrays.toString(i));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        paths[r][c]=steps;
        if(r<maze.length-1){
     pathsTrack(p+"D", r+1, c, maze, paths, steps+1);
        }
        if(c<maze[0].length-1){
            pathsTrack(p+"R", r, c+1, maze, paths, steps+1);   
        }
        if(r>0){
            pathsTrack(p+"U", r-1, c, maze, paths, steps+1);  
        }
        if(c>0){
            pathsTrack(p+"L", r, c-1, maze, paths, steps+1);  
        }
        maze[r][c]=true;
        paths[r][c]=0;
    }
}

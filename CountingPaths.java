public class CountingPaths {
    public static void main(String[] args) {
        System.out.println(CountPathMaze(3, 3));
    }
    static int CountPathMaze(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int right=CountPathMaze(r, c-1);
        int down=CountPathMaze(r-1, c);
        return right+down;
    }
}

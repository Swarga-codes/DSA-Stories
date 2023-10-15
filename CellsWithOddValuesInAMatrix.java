public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m = 2, n = 3; int[][] indices = {{0,1},{1,1}};
System.out.println(oddCells(m, n, indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        int k=0;
        for(int i=0;i<indices.length;i++){
            addRows(matrix,indices[i],n);
            addColumns(matrix,indices[i],m);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]%2!=0){
                    k++;
                }
            }
        }
        return k;
    }
    public static void addRows(int[][] matrix,int[] indices,int n){
        for(int i=0;i<n;i++){
            matrix[indices[0]][i]++;
        }
    }
     public static void addColumns(int[][] matrix,int[] indices,int m){
         for(int i=0;i<m;i++){
            matrix[i][indices[1]]++;
        }
    }
}

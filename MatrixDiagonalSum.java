public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat={{2,3,5},{3,9,1},{4,6,7}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int leftSum=0,rightSum=0,extra=0,k=mat[0].length-1;
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    leftSum+=mat[i][j];
                }
                if(j==k){
                    rightSum+=mat[i][j];
                    k--;
                }
            }
        }
        if(mat[0].length%2==0 && mat[0].length%2==0){
            return leftSum+rightSum;
        }
        extra=mat[mat[0].length/2][mat.length/2];
        return leftSum+rightSum-extra;
    }
}

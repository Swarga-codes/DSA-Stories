public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat={{2,3,5},{3,9,1},{4,6,7}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int leftSum=0,rightSum=0,m=0,n=mat.length-1;
        for(int i=0;i<mat.length;i++){
            leftSum+=mat[i][m++];
            rightSum+=mat[i][n--];
        }
       return mat.length%2==0?leftSum+rightSum:leftSum+rightSum-mat[mat.length/2][mat.length/2];
    }
}

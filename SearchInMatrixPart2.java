public class SearchInMatrixPart2 {
    public static void main(String[] args) {
        int[][] matrix={{-1,2}};
        System.out.println(searchMatrix(matrix,2));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==1 && matrix[0][0]==target){
            return true;
        }
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}

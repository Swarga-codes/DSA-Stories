import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
          
        }
        public static void rotate(int[][] matrix) {
            //Transpose the matrix
            for(int i=0;i<matrix.length;i++){
                for(int j=i+1;j<matrix[0].length;j++){
                    int tmp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=tmp;
                }
            }
            //Reverse each row
            for(int i=0;i<matrix.length;i++){
                int j=0,k=matrix.length-1;
                while(j<=k){
                    int tmp=matrix[i][j];
                    matrix[i][j]=matrix[i][k];
                    matrix[i][k]=tmp;
                    j++;
                    k--;
                }
            }
        }
}

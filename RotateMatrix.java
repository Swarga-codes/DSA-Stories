public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        System.out.println("The resultant matrix is:");
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]+",");
                }
                System.out.println();
            }
        }
        public static void rotate(int[][] matrix) {
            int[][] matr2=new int[matrix.length][matrix[0].length];
            // storing the transpose matrix in the new matrix
                   for(int i=0;i<matrix.length;i++){
                       for(int j=matrix[0].length-1;j>=0;j--){
                           matr2[i][j]=matrix[j][i];
                       }
                   }
                   //storing the rotated transposed matrix in the original matrix
                   for(int i=0;i<matrix.length;i++){
                       for(int j=matrix[0].length-1;j>=0;j--){
                           matrix[i][j]=matr2[i][j];
                       }
                   }
                   //reversing each row to obtain the output
               for(int i=0;i<matrix.length;i++){
                   int start=0,end=matrix[0].length-1;
                   while(start<end){
                       int tmp=matrix[i][start];
                       matrix[i][start]=matrix[i][end];
                       matrix[i][end]=tmp;
                       start++;
                       end--;
           
                   }
               }
           
               
           
           
}
}

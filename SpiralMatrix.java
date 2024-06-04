import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
	    System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        boolean[][] marked=new boolean[matrix.length][matrix[0].length];
        int i=0,j=0,k=0;
        while(list.size()<matrix.length*matrix[0].length){
           
            while(j<matrix[0].length-k && !marked[i][j]){
                list.add(matrix[i][j]);
                marked[i][j++]=true;
            }
            j--;
            i++;
            while(i<matrix.length-k && !marked[i][j]){
                list.add(matrix[i][j]);
                marked[i++][j]=true;

            }
            i--;
            j--;
            while(j>=k && !marked[i][j]){
                list.add(matrix[i][j]);
                marked[i][j--]=true;

            }
            j++;
            i--;
            k++;
            while(i>=k && !marked[i][j]){
                list.add(matrix[i][j]);
                marked[i--][j]=true;

            }
            i++;
            j++;
        }
        return list;
    }
}

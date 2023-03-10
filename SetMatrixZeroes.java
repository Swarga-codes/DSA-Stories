import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix={{1,0,3},{4,9,5},{9,1,0}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void setZeroes(int[][] matrix) {
		int[][] tmp=new int[matrix.length][matrix[0].length];
		for(int i=0;i<matrix.length;i++){
		    for(int j=0;j<matrix[0].length;j++){
		        tmp[i][j]=matrix[i][j];
		    }
		}
			
		for(int i=0;i<matrix.length;i++){
		    for(int j=0;j<matrix[0].length;j++){
		        if(matrix[i][j]==0){
		            setCols(tmp,i);
		            setRows(tmp,j);
		        }
		    }
		}
		for(int i=0;i<matrix.length;i++){
		    for(int j=0;j<matrix[0].length;j++){
		     matrix[i][j]=tmp[i][j];
		    }
		}	
	}
	public static void setRows(int[][] m, int r){
	    for(int i=0;i<m.length;i++){
	        m[i][r]=0;
	    }
	}
		public static void setCols(int[][] m, int c){
	    for(int i=0;i<m[0].length;i++){
	        m[c][i]=0;
	    }
	}
}

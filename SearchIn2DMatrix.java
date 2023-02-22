public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=10;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        if(matrix.length==1 && matrix[0][0]==target){
            return true;
        }
     int m=matrix.length;
     int n=matrix[0].length;
        int l=0,h=(m*n)-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(matrix[mid/n][mid%n]==target){
                return true;
            }
            else if(matrix[mid/n][mid%n]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}

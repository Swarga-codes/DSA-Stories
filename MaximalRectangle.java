import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args) {
        char[][] matrix={{'0','1'},{'1','1'}};
        System.out.println(maximalRectangle(matrix));
    }
      public static int maximalRectangle(char[][] matrix) {
         int[] prefix=new int[matrix[0].length];
         int res=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]=='1'){
                prefix[j]+=1;
               }
               else{
                prefix[j]=0;
               }
            }
         int[] nse=nextSE(prefix);
        int[] pse=prevSE(prefix);
        for(int k=0;k<prefix.length;k++){
            res=Math.max(res,prefix[k]*(nse[k]-pse[k]-1));
        }
        }
       
        return res;
    }
     public static int[] nextSE(int[] heights){
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int[] nse=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        return nse;
    }
    public static int[] prevSE(int[] heights){
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int[] pse=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        return pse;
    }
}
